package org.techhub.lifecycle.programming;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Company implements InitializingBean,DisposableBean{
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public Company()
	{
		System.out.println("i am instancition method");
	}
	public void setId(int id) {
		System.out.println("dependency injection happened with id");
		this.id = id;
	}
	public String getName() {
		System.out.println("dependency injection happened with name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		System.out.println("dependency injection happened with price");
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void UserUtility()
	{
		System.out.println("i am utility");
		System.out.println(id+"\t"+name+"\t"+price);
	}
	public void destroy() throws Exception {
		System.out.println("i am destory method");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("i am init method");
	}
	

}
