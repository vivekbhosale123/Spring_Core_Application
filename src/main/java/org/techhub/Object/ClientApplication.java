package org.techhub.Object;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
	   AnnotationConfigApplicationContext context=new  AnnotationConfigApplicationContext(Config.class);
	   Team t=(Team)context.getBean("t");
	   t.show();
	}

}
