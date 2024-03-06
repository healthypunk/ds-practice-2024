
package com.bookstore.client.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OrderRequest {
    private User user;
    private CreditCard creditCard;
    private String userComment;
    private List<Item> items;
    private String discountCode;
    private String shippingMethod;
    private String giftMessage;
    private BillingAddress billingAddress;
    private Boolean giftWrapping;
    private Boolean termsAndConditionsAccepted;
    private List<String> notificationPreferences;
    private Device device;
    private Browser browser;
    private String appVersion;
    private String screenResolution;
    private String referrer;
    private String deviceLanguage;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    public static class User {
        private String name;
        private String contact;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    public static class CreditCard {
        private String number;
        private String expirationDate;
        private String cvv;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Item {
        private String name;
        private Integer quantity;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    public static class BillingAddress {
        private String street;
        private String city;
        private String state;
        private String zip;
        private String country;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    public static class Device {
        private String type;
        private String model;
        private String os;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    public static class Browser {
        private String name;
        private String version;
    }
}