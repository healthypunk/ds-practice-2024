package com.bookstore.services;

import com.bookstore.runners.ReplicationApplicationRunner;
import com.dspractice.bookstore.database.DatabaseServiceGrpc;
import com.dspractice.bookstore.database.ReadRequest;
import com.dspractice.bookstore.database.ReadResponse;
import com.dspractice.bookstore.database.WriteRequest;
import com.dspractice.bookstore.database.WriteResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DatabaseService extends DatabaseServiceGrpc.DatabaseServiceImplBase {
    private final DataStoreService dataStoreService;

    @Override
    public void write(WriteRequest request, StreamObserver<WriteResponse> responseObserver) {
        if (!ReplicationApplicationRunner.isMaster) {
            log.error("Current node is replica. Read only mode.");
            responseObserver.onError(Status.PERMISSION_DENIED.asException());
        }
        log.info("Write request has been received with key: {}", request.getKey());
        dataStoreService.put(request.getKey(), request.getValue());
        WriteResponse response = WriteResponse.newBuilder().setSuccess(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadRequest request, StreamObserver<ReadResponse> responseObserver) {
        log.info("Read request has been received for key: {}", request.getKey());
        String value = dataStoreService.get(request.getKey());
        ReadResponse response = ReadResponse.newBuilder()
                .setValue(value != null ? value : "")
                .setSuccess(value != null)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
