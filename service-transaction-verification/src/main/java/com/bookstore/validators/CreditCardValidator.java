package com.bookstore.validators;

import lombok.experimental.UtilityClass;

import java.util.regex.Pattern;

@UtilityClass
public class CreditCardValidator {
    // Credit card number pattern (16 digits, no spaces)
    private static final Pattern CREDIT_CARD_PATTERN = Pattern.compile("^\\d{16}$");

    // CVV pattern (3 digits)
    private static final Pattern CVV_PATTERN = Pattern.compile("^\\d{3}$");

    public static boolean isValidCreditCard(String creditCardNumber, String cvv) {
        return isValidCreditCardNumber(creditCardNumber) && isValidCVV(cvv);
    }

    private static boolean isValidCreditCardNumber(String creditCardNumber) {
        return CREDIT_CARD_PATTERN.matcher(creditCardNumber).matches();
    }

    private static boolean isValidCVV(String cvv) {
        return CVV_PATTERN.matcher(cvv).matches();
    }
}
