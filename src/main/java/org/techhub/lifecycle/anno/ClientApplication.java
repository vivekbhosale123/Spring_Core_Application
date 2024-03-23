package org.techhub.lifecycle.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) 
	{
	  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	  Product p=(Product)context.getBean("p");
	  p.userUtility();
	  context.close();
	}

}
