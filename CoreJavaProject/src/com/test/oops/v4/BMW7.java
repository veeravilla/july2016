package com.test.oops.v4;

public class BMW7 implements Car,SportsCar {
	
	public void start(){
		System.out.println("BMW7 Start - Car");
	}

	@Override
	public void stop() {
		System.out.println("BMW7 Stop - Car");
		
	}

	@Override
	public void move() {
		System.out.println("BMW7 Move - Car");
		
	}

}
