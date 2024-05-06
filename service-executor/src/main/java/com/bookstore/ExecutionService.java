package com.bookstore;

import com.dspractice.bookstore.commonproto.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class ExecutionService extends ExecutorServiceGrpc.ExecutorServiceImplBase {
    private final DatabaseService databaseService;
    private final PaymentService paymentService;

    @Override
    public void isActive(ExecutorServiceStatusRequest request, StreamObserver<ExecutorServiceStatusResponse> responseObserver) {
        responseObserver.onNext(ExecutorServiceStatusResponse.newBuilder().setActive(true).build());
        responseObserver.onCompleted();
    }

    @Override
    public void execute(ExecutorServiceExecutionRequest request, StreamObserver<ExecutorServiceExecutionResponse> responseObserver) {
        log.info("Order is being executed… {}", request.getOrderId());
        String paymentId = null;
        try {
            paymentId = paymentService.init(request.getOrderId());
            paymentService.commit(paymentId);
            databaseService.save(request.getOrderId(), paymentId);

        } catch (Exception e) {
            if (paymentId != null) {
                paymentService.rollback(paymentId);

            }
        }
        responseObserver.onNext(ExecutorServiceExecutionResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
