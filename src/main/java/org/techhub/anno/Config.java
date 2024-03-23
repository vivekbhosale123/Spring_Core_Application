package org.techhub.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name="c")
	public Company getCompany()
	{
		return new Company();
	}
}
