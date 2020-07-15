package com.cl.elena.pattern.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String  orderNo = String.valueOf(Math.random());

	public Order() {

	}

	public List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getPrice() {
		float price = 0.0f;
		for (Item item : items) {
			price += item.price();
		}
		return price;
	}

	public String showOrder() {
		StringBuilder order = new StringBuilder();
		for (Item item : items) {
			order.append(item.name());
			System.out.println("orderNo:" + orderNo);
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());

		}
		return order.toString();
	}

}
