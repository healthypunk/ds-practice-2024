package com.bookstore.validators;

import com.bookstore.CommonValidator;
import com.dspractice.bookstore.commonproto.FraudUserDataRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserDataValidator {
    public static boolean validateRequest(FraudUserDataRequest request) {
        return CommonValidator.isNotBlank(request.getBrowserName(), request.getBrowserVersion(), request.getDeviceModel(), request.getDeviceOs(), request.getDeviceType());
    }
}
