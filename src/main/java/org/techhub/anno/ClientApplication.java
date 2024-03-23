package org.techhub.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ClientApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Company c=(Company)context.getBean("c");
		System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getPrice());
	}

}
