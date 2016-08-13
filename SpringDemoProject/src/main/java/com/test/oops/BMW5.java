package com.test.oops;

import org.springframework.stereotype.Component;

@Component
public class BMW5 implements Car{
	
	public void start(){
		System.out.println("BMW 5 Start - Car");
	}

	@Override
	public void stop() {
		System.out.println("BMW 5 Stop - Car");
		
	}

	@Override
	public void move() {
		System.out.println("BMW 5 Move - Car");
		
	}
	
	
	

}
