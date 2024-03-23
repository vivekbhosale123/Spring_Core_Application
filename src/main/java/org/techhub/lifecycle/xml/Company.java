package org.techhub.lifecycle.xml;

public class Company {
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("dependency injection happped");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("dependency injection happped");
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		System.out.println("dependency injection happped");
		this.sal = sal;
	}
    public void userInitMethod()
    {
    	System.out.println("i am  init method");
    }
    public void userUtility()
    {
    	System.out.println("i am utility");
    	System.out.println(id+"\t"+name+"\t"+sal);
    }
    public void destroy()
    {
    	System.out.println("i am destroy");
    }
}
