package hu.david.ecommerce.dto;

import java.util.Set;

import hu.david.ecommerce.entity.Address;
import hu.david.ecommerce.entity.Customer;
import hu.david.ecommerce.entity.Order;
import hu.david.ecommerce.entity.OrderItem;
import lombok.Data;

@Data
public class Purchase {
	
	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
}
