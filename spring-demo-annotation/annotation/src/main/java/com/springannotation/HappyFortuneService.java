package com.springannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println("default constructor:HappyFortuneService");
	}
	@Override
	public String getDailyFortune() {
	
		return "today is your lucky day";
	}

}
