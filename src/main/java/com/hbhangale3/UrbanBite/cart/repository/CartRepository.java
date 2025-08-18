package com.hbhangale3.UrbanBite.cart.repository;

import com.hbhangale3.UrbanBite.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByUser_Id(Long userId);

}
