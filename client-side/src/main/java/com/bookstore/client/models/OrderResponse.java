package com.bookstore.client.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OrderResponse {
    public String orderId;
    public String orderStatus;
    private List<SuggestedBooks> suggestedBooks;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Accessors(chain = true)
    public static class SuggestedBooks {
        private String bookId;
        private String title;
        private String author;
    }

}
