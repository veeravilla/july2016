package com.test.oops.v4;

public class BMW5 implements Car,SportsCar{
	
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
