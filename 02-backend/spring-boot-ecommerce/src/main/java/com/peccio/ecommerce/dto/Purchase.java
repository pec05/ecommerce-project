package com.peccio.ecommerce.dto;

import com.peccio.ecommerce.entity.Address;
import com.peccio.ecommerce.entity.Customer;
import com.peccio.ecommerce.entity.Order;
import com.peccio.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
