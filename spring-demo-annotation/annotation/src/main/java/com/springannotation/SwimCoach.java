package com.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class SwimCoach implements Coach {

	private FortuneService fortuneservice;

	public SwimCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {

		return "swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getDailyFortune();
	}

}
