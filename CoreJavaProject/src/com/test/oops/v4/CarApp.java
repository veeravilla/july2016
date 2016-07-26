package com.test.oops.v4;

public class CarApp {
	
	public static void main(String s[]){
		Car carObj;
		//executeCar(carObj);
		carObj = new Honda();
		executeCar(carObj);
		
	}
	
	public static void executeCar(Car carObj){
		if(carObj instanceof SportsCar){
			System.out.println("SportsCar Logic ///// ");
		}else if(carObj instanceof BaseCar ){
			System.out.println("Base Car Logic !!!!!!");
		}
		carObj.start();
		carObj.move();
		carObj.stop();
	}
	
}
