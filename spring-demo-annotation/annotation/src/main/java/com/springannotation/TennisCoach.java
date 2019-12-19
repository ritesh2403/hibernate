package com.springannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Autowired // field injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneservice;

	@Value("${foo.name}")
	private String name;

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;

	public TennisCoach() {
		System.out.println("default constructor:TennisCoach");
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">>TennisCoach inside of doMyStartUpStuff");
	}
	
	//define destroy 
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">>TennisCoach inside of doMyCleanUpStuff");
	}
	
	
	
	/*
	 * @Autowired constructor dependency injection public TennisCoach(FortuneService
	 * fortuneservice) { this.fortuneservice = fortuneservice; }
	 */

	@Override
	public String getDailyWorkout() {

		return "practice your backhand volley";
	}

	public FortuneService getFortuneservice() {
		return fortuneservice;
	}

	/*
	 * @Autowired setter injection public void setFortuneservice(FortuneService
	 * fortuneservice) {
	 * 
	 * System.out.println("setting constructor:TennisCoach"); this.fortuneservice =
	 * fortuneservice;
	 * 
	 * }
	 */

	@Override
	public String getDailyFortune() {

		return fortuneservice.getDailyFortune();
	}

}
