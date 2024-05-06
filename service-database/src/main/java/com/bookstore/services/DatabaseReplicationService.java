package com.bookstore.services;

import com.dspractice.bookstore.database.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

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
                            // Assume the node is down and continue
                            return false;
                        }
                    });
            isMasterNode.set(!foundMaster);
        }
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
        super.sendUpdate(request, responseObserver);
    }

    @Override
    public void requestUpdates(UpdateSinceRequest request, StreamObserver<UpdateSinceResponse> responseObserver) {
        super.requestUpdates(request, responseObserver);
    }
}
