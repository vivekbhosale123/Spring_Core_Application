package org.techhub.Object;

import org.springframework.beans.factory.annotation.Value;

public class Player {
    @Value("1")
	private int id;
    @Value("vikcy")
	private String name;
    @Value("1000")
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
