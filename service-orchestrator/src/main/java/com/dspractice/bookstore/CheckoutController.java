package com.dspractice.bookstore;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("checkout")
public class CheckoutController {
    @PostMapping()
    public String checkout() {
        return "heelo";
    }
}
