package com.bookstore.validators;

import com.bookstore.CommonValidator;
import com.dspractice.bookstore.commonproto.CreditCard;
import com.dspractice.bookstore.commonproto.TransactionCreditCardRequest;
import lombok.experimental.UtilityClass;

import java.util.regex.Pattern;

@UtilityClass
public class CreditCardValidator {

    public static boolean validateRequest(TransactionCreditCardRequest request) {
        CreditCard creditCard = request.getCard();
        return CommonValidator.isNotNull(creditCard.getNumber(), creditCard.getCvv(), creditCard.getExpirationDate());
    }
    // Credit card number pattern (16 digits, no spaces)
    private static final Pattern CREDIT_CARD_PATTERN = Pattern.compile("^\\d{16}$");

    // CVV pattern (3 digits)
    private static final Pattern CVV_PATTERN = Pattern.compile("^\\d{3}$");

    public static boolean validateCreditCard(TransactionCreditCardRequest request) {
        return isValidCreditCardNumber(request.getCard().getNumber()) && isValidCVV(request.getCard().getCvv());
    }

    private static boolean isValidCreditCardNumber(String creditCardNumber) {
        return CREDIT_CARD_PATTERN.matcher(creditCardNumber).matches();
    }

    private static boolean isValidCVV(String cvv) {
        return CVV_PATTERN.matcher(cvv).matches();
    }
}
