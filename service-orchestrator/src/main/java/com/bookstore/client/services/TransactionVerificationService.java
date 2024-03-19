package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.dspractice.bookstore.commonproto.ContactAddress;
import com.dspractice.bookstore.commonproto.CreditCard;
import com.dspractice.bookstore.commonproto.Item;
import com.dspractice.bookstore.commonproto.TransactionBooksRequest;
import com.dspractice.bookstore.commonproto.TransactionContactRequest;
import com.dspractice.bookstore.commonproto.TransactionCreditCardRequest;
import com.dspractice.bookstore.commonproto.TransactionVerificationServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TransactionVerificationService {
    @GrpcClient("grpc-transaction-verification")
    private TransactionVerificationServiceGrpc.TransactionVerificationServiceBlockingStub transactionVerificationServiceStub;

    public boolean verifyBooks(OrderRequest request) {
        if (request.getItems().isEmpty()) {
            return false;
        }
        List<Item> items = request.getItems().stream().map(i -> Item.newBuilder().setName(i.getName()).setQuantity(i.getQuantity()).build()).toList();

        TransactionBooksRequest transactionBooksRequest = TransactionBooksRequest.newBuilder()
                .setOrderId(request.getId())
                .addAllBooks(items)
                .build();
        return request.getId().equals(transactionVerificationServiceStub.verifyBooks(transactionBooksRequest).getOrderId());
    }

    public boolean verifyCreditCard(OrderRequest request) {
        OrderRequest.CreditCard card = request.getCreditCard();
        if (Objects.isNull(card)) {
            return false;
        }

        CreditCard creditCard = CreditCard.newBuilder()
                .setNumber(card.getNumber())
                .setCvv(card.getCvv())
                .setExpirationDate(card.getExpirationDate())
                .build();

        TransactionCreditCardRequest transactionCreditCardRequest = TransactionCreditCardRequest.newBuilder()
                .setOrderId(request.getId())
                .setCard(creditCard)
                .build();

        return request.getId().equals(transactionVerificationServiceStub.verifyCreditCard(transactionCreditCardRequest).getOrderId());
    }

    public boolean verifyContact(OrderRequest request) {
        OrderRequest.User user = request.getUser();
        OrderRequest.BillingAddress address = request.getBillingAddress();
        if (Objects.isNull(user) || Objects.isNull(address)) {
            return false;
        }

        ContactAddress contactAddress = ContactAddress.newBuilder()
                .setStreet(address.getStreet())
                .setCity(address.getCity())
                .setState(address.getState())
                .setCountry(address.getCountry())
                .setZip(address.getZip())
                .build();

        TransactionContactRequest transactionContactRequest = TransactionContactRequest.newBuilder()
                .setOrderId(request.getId())
                .setName(user.getName())
                .setContact(user.getContact())
                .setContactAddress(contactAddress)
                .build();
        return request.getId().equals(transactionVerificationServiceStub.verifyContact(transactionContactRequest).getOrderId());
    }


}
