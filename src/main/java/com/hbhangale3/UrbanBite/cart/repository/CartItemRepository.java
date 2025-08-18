package com.hbhangale3.UrbanBite.cart.repository;

import com.hbhangale3.UrbanBite.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
