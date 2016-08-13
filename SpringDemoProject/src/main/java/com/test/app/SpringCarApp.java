package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCarApp {
	
	public static void main(String s[]){
		
		ApplicationContext springContainer = 
				new ClassPathXmlApplicationContext("applicationContextWithCustomObjects.xml");
		
		CarApp carApp = springContainer.getBean("carApp",CarApp.class); 
		
		carApp.executeCar();
		
	}
	
}
