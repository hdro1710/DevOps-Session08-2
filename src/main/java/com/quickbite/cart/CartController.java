package com.quickbite.cart;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @GetMapping
    public Map<String, Object> getCart() {
        return Map.of(
                "userId", 1,
                "items", List.of(
                        Map.of("name", "Burger", "quantity", 2),
                        Map.of("name", "Coca-Cola", "quantity", 1)));
    }
}
