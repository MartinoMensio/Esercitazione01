package it.polito.ai.businesslogic;

import java.util.Map;

public interface PaymentService {
	boolean pay(Map<String,Integer> list);
	void insertPaymentInfo();
}
