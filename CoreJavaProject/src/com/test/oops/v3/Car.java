package com.test.oops.v3;

public abstract class Car {
	
	public abstract void start();
	
	public void stop(){
		System.out.println("Stop - Car");
	}
	
	public void move(){
		System.out.println("Move - Car");
	}
	
	public void execute(){
		start();
		move();
		stop();
	}
	
	

}
