package com.test.oops.v5;

public class CarApp {
	
	public static void main(String s[]){
		Car carObj;
		//executeCar(carObj);
		carObj = new BMW5();
		executeCar(carObj);
		
	}
	
	public static void executeCar(Car carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}
	
}
