package com.peccio.ecommerce.service;

import com.peccio.ecommerce.dto.Purchase;
import com.peccio.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
