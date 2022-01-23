package hu.david.ecommerce.service;

import hu.david.ecommerce.dto.Purchase;
import hu.david.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
	
	PurchaseResponse placeOrder(Purchase purchase);
	
}
