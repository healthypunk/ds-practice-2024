package com.bookstore.validators;

import com.bookstore.CommonValidator;
import com.dspractice.bookstore.commonproto.TransactionBooksRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BookValidator {
    public static boolean validateRequest(TransactionBooksRequest request) {
        return request.getBooksCount() > 0 && request.getBooksList().stream().allMatch(book -> CommonValidator.isNotBlank(book.getName()) && CommonValidator.isNotNull(book.getQuantity()));
    }
}
