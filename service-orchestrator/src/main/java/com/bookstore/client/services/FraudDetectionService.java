package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.dspractice.bookstore.commonproto.FraudBillingAddress;
import com.dspractice.bookstore.commonproto.FraudCreditCard;
import com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest;
import com.dspractice.bookstore.commonproto.FraudDetectionServiceGrpc;
import com.dspractice.bookstore.commonproto.FraudUserDataRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class FraudDetectionService {
    @GrpcClient("grpc-fraud-detection")
    private FraudDetectionServiceGrpc.FraudDetectionServiceBlockingStub fraudDetectionServiceBlockingStub;

    /***
     * Method detects fraud from given user data
     *
     * @param orderRequest
     * @return positive if initial data is missing, otherwise it gives an error
     */

    public boolean detectUserDataFraud(OrderRequest orderRequest) {
        OrderRequest.Browser browser = orderRequest.getBrowser();
        OrderRequest.Device device = orderRequest.getDevice();
        if (Objects.isNull(browser) || Objects.isNull(device)) {
            return true;
        }
        FraudUserDataRequest request = FraudUserDataRequest.newBuilder()
                .setOrderId(orderRequest.getId())
                .setBrowserName(browser.getName())
                .setBrowserVersion(browser.getVersion())
                .setDeviceModel(device.getModel())
                .setDeviceType(device.getType())
                .setDeviceOs(device.getOs())
                .build();
        return orderRequest.getId().equals(fraudDetectionServiceBlockingStub.detectUserDataFraud(request).getOrderId());
    }

    public boolean detectCreditCardFraud(OrderRequest orderRequest) {
        OrderRequest.CreditCard card = orderRequest.getCreditCard();
        OrderRequest.BillingAddress address = orderRequest.getBillingAddress();
        if (Objects.isNull(card) || Objects.isNull(address)) {
            return false;
        }

        FraudCreditCard fraudCreditCard = FraudCreditCard.newBuilder()
                .setNumber(card.getNumber())
                .setCvv(card.getCvv())
                .setExpirationDate(card.getExpirationDate())
                .build();

        FraudBillingAddress fraudBillingAddress = FraudBillingAddress.newBuilder()
                .setStreet(address.getStreet())
                .setCity(address.getCity())
                .setState(address.getState())
                .setCountry(address.getCountry())
                .setZip(address.getZip())
                .build();

        FraudCreditCardDetectionRequest request = FraudCreditCardDetectionRequest.newBuilder()
                .setOrderId(orderRequest.getId())
                .setCard(fraudCreditCard)
                .setAddress(fraudBillingAddress).build();

        return orderRequest.getId().equals(fraudDetectionServiceBlockingStub.detectCardFraud(request).getOrderId());
    }
}
