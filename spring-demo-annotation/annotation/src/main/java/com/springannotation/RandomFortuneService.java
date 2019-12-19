package com.springannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	public RandomFortuneService(){
		System.out.println("inside RandomFortuneService() ");
	}

	private String[] data = { "beaware of wolf,s in sheep clothing", 
								"Deligence is the mother of good luck",
								"the journey is the reward" };

	
	//create a random no genetr
	
	private Random myrandom=new Random();
	@Override
	public String getDailyFortune() {
        int index=myrandom.nextInt(data.length);
        String thefortune=data[index];
		return thefortune;
	}

}
