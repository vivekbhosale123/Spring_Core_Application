package org.techhub.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		ShowRoom s=(ShowRoom)context.getBean("s");
		s.show();
	}

}
