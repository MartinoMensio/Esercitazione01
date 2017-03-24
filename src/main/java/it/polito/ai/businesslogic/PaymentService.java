package it.polito.ai.businesslogic;

import java.util.Map;

public interface PaymentService {
	boolean setCartItem(Map<String,Integer> cartItems);
	boolean setPaymentInfo(PaymentInfo paymentInfo);
	boolean pay();
}
