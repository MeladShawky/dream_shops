package com.meloCoding.dream_shops.services.Order;

import com.meloCoding.dream_shops.dto.OrderDto;
import com.meloCoding.dream_shops.models.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
}
