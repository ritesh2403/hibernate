package com.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Coach coach=context.getBean("tennisCoach", Coach.class) ;
		
		Coach thecoach=context.getBean("tennisCoach", Coach.class);
		
		boolean result=(coach==thecoach);
		
		System.out.println("\n pointing to the same object:"+result);
		System.out.println("\n Memory location for coach:"+coach);
		System.out.println("\n Memory location for thecoach:"+thecoach);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
		

	}

}
