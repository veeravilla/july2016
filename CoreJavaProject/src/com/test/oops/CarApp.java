package com.test.oops;


public class CarApp {
	
	public static void main(String s[]){
		Car carObj = new Car();
		executeCar(carObj);
	}
	
	public static void executeCar(Car carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}

}
