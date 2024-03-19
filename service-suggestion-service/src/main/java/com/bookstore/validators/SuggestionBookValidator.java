package com.bookstore.validators;

import com.bookstore.CommonValidator;
import com.dspractice.bookstore.commonproto.SuggestionRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SuggestionBookValidator {
    public static boolean validateRequest(SuggestionRequest request) {
        return request.getBooksNamesList().stream().allMatch(CommonValidator::isNotBlank);
    }
}
