package com.test.oops;

import org.springframework.stereotype.Component;

@Component
public class BMW3 implements Car {
	
	public void start(){
		System.out.println("BMW3 Start - Car");
	}

	@Override
	public void stop() {
		System.out.println("BMW3 Start - Stop");
		
	}

	@Override
	public void move() {
		System.out.println("BMW3 Start - Move");
	}
	
}
