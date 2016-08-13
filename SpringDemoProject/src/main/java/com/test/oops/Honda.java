package com.test.oops;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Car {
	
	public void start(){
		System.out.println("Honda Start - Car");
	}

	@Override
	public void stop() {
		System.out.println("Honda Stop - Car");
		
	}

	@Override
	public void move() {
		System.out.println("Honda Move - Car");
		
	}

}
