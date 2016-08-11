package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Student;

public class SpringIOCDemo {

	public static void main(String[] args) {
		ApplicationContext springContainer = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student1 = springContainer.getBean("student1",Student.class);
		
		Student student2 = springContainer.getBean("student2",Student.class);
		
		Student student3 = springContainer.getBean("student1",Student.class);

		Student student4 = springContainer.getBean("student1",Student.class);
		
		System.out.println(student1);
		
		System.out.println(student2);

	}

}
