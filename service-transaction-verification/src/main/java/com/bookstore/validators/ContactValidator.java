package com.bookstore.validators;

import com.bookstore.CommonValidator;
import com.dspractice.bookstore.commonproto.ContactAddress;
import com.dspractice.bookstore.commonproto.TransactionContactRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ContactValidator {

    public static boolean validateRequest(TransactionContactRequest request) {
        ContactAddress contact = request.getContactAddress();
        return CommonValidator.isNotBlank(request.getName(), request.getContact())
                && CommonValidator.isNotBlank(contact.getStreet(), contact.getCity(), contact.getState(), contact.getCity(), contact.getCountry());
    }
}
