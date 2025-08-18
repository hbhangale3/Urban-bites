package com.hbhangale3.UrbanBite.payment.repository;

import com.hbhangale3.UrbanBite.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
