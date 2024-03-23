package org.techhub.lifecycle.programming;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
	public static void main(String[] args) 
	{
	   ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
	   Company c=(Company)context.getBean("p");
	   c.UserUtility();
	   context.close();
	}

}
