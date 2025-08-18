package com.hbhangale3.UrbanBite.order.services;

import com.hbhangale3.UrbanBite.enums.OrderStatus;
import com.hbhangale3.UrbanBite.order.dtos.OrderDTO;
import com.hbhangale3.UrbanBite.order.dtos.OrderItemDTO;
import com.hbhangale3.UrbanBite.response.Response;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {

    Response<?> placeOrderFromCart();
    Response<OrderDTO> getOrderById(Long id);
    Response<Page<OrderDTO>> getAllOrders(OrderStatus orderStatus, int page, int size);
    Response<List<OrderDTO>> getOrdersOfUser();
    Response<OrderItemDTO> getOrderItemById(Long orderItemId);
    Response<OrderDTO> updateOrderStatus(OrderDTO orderDTO);
    Response<Long> countUniqueCustomers();
}
