package com.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springannotation")
public class SportConfig {

	@Bean // define bean for sadFortuneService
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean // define bean for swim coach and inject dependency
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());

	}
}
