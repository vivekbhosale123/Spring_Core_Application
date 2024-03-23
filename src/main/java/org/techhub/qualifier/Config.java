package org.techhub.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {

	@Bean(name="c")
	public Car getCar()
	{
		return new Car();
	}
	@Bean(name="b")
	public Bike getBike()
	{
		return new Bike();
	}
	@Bean("s")
	public ShowRoom getShowRoom()
	{
		return new ShowRoom();
	}
}
