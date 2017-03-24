package it.polito.ai.businesslogic;

import java.util.*;

public class CartServiceImpl implements CartService {
	
	private Map<String, Integer> items;
	
	public CartServiceImpl() {
		items = new HashMap<String, Integer>();
	}
	
	public CartServiceImpl(Map<String, Integer> items) {
		this.items = items;
	}

	public boolean addItem(String travelDocumentId, int quantity) {
		return items.putIfAbsent(travelDocumentId, quantity) == null;
	}

	public boolean removeItem(String travelDocumentId) {
		return items.remove(travelDocumentId) != null;
	}

	public boolean updateItem(String travelDocumentId, int quantity) {
		items.put(travelDocumentId, quantity);
		return true;
	}

	public boolean removeAll() {
		items.clear();
		return true;
	}

	public Map<String, Integer> getItems() {
		return items;
	}

	public float getTotal() {
		float total = 0;
		for(Map.Entry<String, Integer> entry : items.entrySet()) {
			float unitPrice = 1;
			// TODO get the unit price from the map of TravelDocument
			// travelDocumentMap.get(entry.getKey()).getPrice()
			total += unitPrice * entry.getValue();
		}
		return total;
	}

}
