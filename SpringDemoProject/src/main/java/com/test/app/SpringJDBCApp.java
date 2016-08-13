package com.test.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.jdbc.StudentDTO;
import com.test.jdbc.StudentJDBCDAO;

public class SpringJDBCApp {

	private static Logger logger = LoggerFactory.getLogger(SpringJDBCApp.class);
	
	public static void main(String[] args) {
		
		
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("spring-jdbc-context.xml");
		
		StudentJDBCDAO studentDAO = springContainer.getBean(StudentJDBCDAO.class);
		
		StudentDTO studentDTO = studentDAO.getStudent(103);
		logger.debug("Output ########## " + studentDTO);
		
		//New Record
		studentDAO.save(new StudentDTO(88888, "Steve", "MS", 88888));
		
		//Delete
		studentDAO.delete(101);
		
		//Get All students
		logger.info(" Student List $$$$$$$ " + studentDAO.getAllStudents());
		
		//Get Student count
		logger.warn(" Count ::::: " + studentDAO.getStudentCount());
		
	}

}
