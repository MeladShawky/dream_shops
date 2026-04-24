package com.meloCoding.dream_shops.services.Cart;

import java.math.BigDecimal;

import com.meloCoding.dream_shops.models.Cart;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Long initializeCart();
    Cart getCartByUserId(Long userId);
}