package org.techhub.lifecycle.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class Product {
	@Value("1")
	private int id;
	@Value("vicky")
	private String name;
	@Value("1000")
	private int price;
	public int getId() {
		return id;
	}
	@PostConstruct
	public void useInitMethod()
	{
		System.out.println("i am init method");
	}
	@PreDestroy
	public void userDestory()
	{
		System.out.println("i am destroy method");
	}
	public void userUtility()
	{
		System.out.println("i am utility method");
		System.out.println(id+"\t"+name+"\t"+price);
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
