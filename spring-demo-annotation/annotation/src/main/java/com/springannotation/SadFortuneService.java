package com.springannotation;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {

		return "today is a sad day";
	}

}
