package com.springannotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public DatabaseFortuneService() {
		System.out.println("inside DatabaseFortuneService()");
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
