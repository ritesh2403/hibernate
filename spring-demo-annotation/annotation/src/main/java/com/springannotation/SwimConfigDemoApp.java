package com.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach coach =  context.getBean("swimCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
	

		context.close();

	}

}
