package org.techhub.lifecycle.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name="p")
	public Product getProduct()
	{
		return new Product();
	}
}
