package com.objis.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocieteDevLogicielConfig {
	
	
	
	
	@Bean
	public SocieteDevLogiciel societeDevLogiciel() {
		return new SocieteDevLogiciel(developpeurDebutant(), developpeurChef());
	}
	
	
	@Bean
	public Developpeur developpeurChef() {
		return new Developpeur("Ahmadou",15);
	}
	
	@Bean
	public Developpeur developpeurDebutant() {
		return new Developpeur("Giovanni",8);
	}


	
}
