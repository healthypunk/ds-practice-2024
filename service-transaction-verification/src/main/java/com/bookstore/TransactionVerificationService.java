package com.bookstore;

import com.bookstore.validators.ContactValidator;
import com.bookstore.validators.CreditCardValidator;
import com.dspractice.bookstore.commonproto.TransactionBooksRequest;
import com.dspractice.bookstore.commonproto.TransactionBooksResponse;
import com.dspractice.bookstore.commonproto.TransactionContactRequest;
import com.dspractice.bookstore.commonproto.TransactionContactResponse;
import com.dspractice.bookstore.commonproto.TransactionCreditCardRequest;
import com.dspractice.bookstore.commonproto.TransactionCreditCardResponse;
import com.dspractice.bookstore.commonproto.TransactionVerificationServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import static com.bookstore.validators.BookValidator.validateRequest;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class TransactionVerificationService extends TransactionVerificationServiceGrpc.TransactionVerificationServiceImplBase {

    @Override
    public void verifyBooks(TransactionBooksRequest request, StreamObserver<TransactionBooksResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Request for books verification");
        if (!validateRequest(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        TransactionBooksResponse response = TransactionBooksResponse.newBuilder()
                .setOrderId(request.getOrderId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Books verification result: ", false);
    }

    @Override
    public void verifyCreditCard(TransactionCreditCardRequest request, StreamObserver<TransactionCreditCardResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Request for verification");
        if (!CreditCardValidator.validateRequest(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        if (!CreditCardValidator.validateCreditCard(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Card number or cvv are incorrect").asException());
            return;
        }
        TransactionCreditCardResponse response = TransactionCreditCardResponse.newBuilder()
                .setOrderId(request.getOrderId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Card verification result: ", false);
    }

    @Override
    public void verifyContact(TransactionContactRequest request, StreamObserver<TransactionContactResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Request for contact information verification");
        if (!ContactValidator.validateRequest(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        TransactionContactResponse response = TransactionContactResponse.newBuilder()
                .setOrderId(request.getOrderId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Contact verification result: ", false);
    }
}
