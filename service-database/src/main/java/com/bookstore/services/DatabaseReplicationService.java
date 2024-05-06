package com.bookstore.services;

import com.dspractice.bookstore.database.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Slf4j
@Service
@RequiredArgsConstructor
public class DatabaseReplicationService extends DatabaseReplicationGrpc.DatabaseReplicationImplBase {

    private final AtomicBoolean isMasterNode = new AtomicBoolean(false);
    private final DataStoreService dataStoreService;
    private final List<DatabaseReplicationGrpc.DatabaseReplicationBlockingStub> replicationClients;

    public boolean isMaster() {
        return isMasterNode.get();
    }

    public void determineRole() {
        if (replicationClients.isEmpty()) {
            // If no clients are configured, assume master role
            isMasterNode.set(true);
        } else {
            boolean foundMaster = replicationClients.stream()
                    .anyMatch(client -> {
                        try {
                            QueryMasterResponse response = client.isMaster(QueryMasterRequest.newBuilder().build());
                            return response.getIsMaster();
                        } catch (Exception e) {
                            log.info(e.getMessage());
                            // Assume the node is down and continue
                            return false;
                        }
                    });
            isMasterNode.set(!foundMaster);
        }
    }

    public DatabaseReplicationGrpc.DatabaseReplicationBlockingStub findMaster() {
        for (DatabaseReplicationGrpc.DatabaseReplicationBlockingStub client : replicationClients) {
            try {
                QueryMasterResponse response = client.isMaster(QueryMasterRequest.newBuilder().build());
                if (response.getIsMaster()) {
                    return client; // Return the client stub for the master node
                }
            } catch (Exception e) {
                // Log error or handle it according to your error policy
                System.out.println("Failed to connect or error occurred querying node: " + e.getMessage());
            }
        }
        return null; // No master found, or all nodes are down
    }

    @Override
    public void isMaster(QueryMasterRequest request, StreamObserver<QueryMasterResponse> responseObserver) {
        QueryMasterResponse response = QueryMasterResponse.newBuilder()
                .setIsMaster(isMasterNode.get())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sendSnapshot(SnapshotRequest request, StreamObserver<SnapshotResponse> responseObserver) {
        super.sendSnapshot(request, responseObserver);
    }

    @Override
    public void sendUpdate(UpdateRequest request, StreamObserver<UpdateResponse> responseObserver) {
        log.info("Received updated from the master with key: {} and value: {}", request.getEntry().getKey(), request.getEntry().getValue());
        dataStoreService.put(request.getEntry().getKey(), request.getEntry().getValue());
        UpdateResponse response = UpdateResponse.newBuilder().setSuccess(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void requestUpdates(UpdateSinceRequest request, StreamObserver<UpdateSinceResponse> responseObserver) {
        List<Entry> updates = dataStoreService.getAllUpdates();
        UpdateSinceResponse response = UpdateSinceResponse.newBuilder()
                .addAllUpdates(updates)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
