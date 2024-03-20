package com.bookstore.validators;

import com.bookstore.CommonValidator;
import com.dspractice.bookstore.commonproto.FraudBillingAddress;
import com.dspractice.bookstore.commonproto.FraudCreditCard;
import com.dspractice.bookstore.commonproto.FraudCreditCardDetectionRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CreditCardValidator {
    public static boolean validateRequest(FraudCreditCardDetectionRequest request) {
        FraudCreditCard card = request.getCard();
        FraudBillingAddress fraudBillingAddress = request.getAddress();
        return CommonValidator.isNotBlank(card.getCvv(), card.getNumber(), card.getExpirationDate()) &&
                CommonValidator.isNotBlank(fraudBillingAddress.getStreet(), fraudBillingAddress.getStreet(), fraudBillingAddress.getState(), fraudBillingAddress.getZip(), fraudBillingAddress.getCountry());
    }
}
