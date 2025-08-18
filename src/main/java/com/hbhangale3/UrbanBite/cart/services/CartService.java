package com.hbhangale3.UrbanBite.cart.services;

import com.hbhangale3.UrbanBite.cart.dtos.CartDTO;
import com.hbhangale3.UrbanBite.response.Response;

public interface CartService {

    Response<?> addItemToCart(CartDTO cartDTO);
    Response<?> incrementItem(Long menuId);
    Response<?> decrementItem(Long menuId);
    Response<?> removeItem(Long cartItemId);
    Response<CartDTO> getShoppingCart();
    Response<?> clearShoppingCart();
}
