package org.techhub.Object;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name="p")
	public Player getPlayer()
	{
		return new Player();
	}
    @Bean(name="t")
    public Team getTeam()
	{
		return new Team();
	}
}
