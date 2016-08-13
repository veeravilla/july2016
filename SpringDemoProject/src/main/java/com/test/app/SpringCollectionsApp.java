package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.ReferenceData;

public class SpringCollectionsApp {
	
	public static void main(String s[]){
		
		ApplicationContext springContainer = 
				new ClassPathXmlApplicationContext("collectionApplicationContext.xml");
		
		ReferenceData refObj = springContainer.getBean("referneceData",ReferenceData.class); 
		
		System.out.println(refObj);
		
	}
	
}
