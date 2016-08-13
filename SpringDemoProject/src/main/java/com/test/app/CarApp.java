package com.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.test.oops.Car;

@Component
public class CarApp {
	
	
	@Autowired
	@Qualifier("honda")
	private Car car;
	
	
	public void executeCar(){
		car.start();
		car.move();
		car.stop();
	}
	
}
