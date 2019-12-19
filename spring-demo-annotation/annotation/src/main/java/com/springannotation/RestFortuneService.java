package com.springannotation;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "happy face";
	}

}
