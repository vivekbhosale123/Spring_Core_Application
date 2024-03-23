package org.techhub.lifecycle.xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
	   Company c=(Company)context.getBean("c");
	   c.userUtility();
	   context.close();
	}

}
