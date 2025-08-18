package com.hbhangale3.UrbanBite.payment.services;


import com.hbhangale3.UrbanBite.payment.dtos.PaymentDTO;
import com.hbhangale3.UrbanBite.response.Response;

import java.util.List;

public interface PaymentService {

    Response<?> initializePayment(PaymentDTO paymentDTO);
    void updatePaymentForOrder(PaymentDTO paymentDTO);
    Response<List<PaymentDTO>> getAllPayments();
    Response<PaymentDTO> getPaymentById(Long paymentId);

}
