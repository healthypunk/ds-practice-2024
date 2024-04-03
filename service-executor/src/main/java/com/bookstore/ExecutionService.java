package com.bookstore;

import com.dspractice.bookstore.commonproto.ExecutorServiceExecutionRequest;
import com.dspractice.bookstore.commonproto.ExecutorServiceExecutionResponse;
import com.dspractice.bookstore.commonproto.ExecutorServiceGrpc;
import com.dspractice.bookstore.commonproto.ExecutorServiceStatusRequest;
import com.dspractice.bookstore.commonproto.ExecutorServiceStatusResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class ExecutionService extends ExecutorServiceGrpc.ExecutorServiceImplBase {

    @Override
    public void isActive(ExecutorServiceStatusRequest request, StreamObserver<ExecutorServiceStatusResponse> responseObserver) {
        responseObserver.onNext(ExecutorServiceStatusResponse.newBuilder().setActive(true).build());
        responseObserver.onCompleted();
    }

    @Override
    public void execute(ExecutorServiceExecutionRequest request, StreamObserver<ExecutorServiceExecutionResponse> responseObserver) {
        log.info("Order is being executed… {}", request.getOrderId());
        responseObserver.onNext(ExecutorServiceExecutionResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
