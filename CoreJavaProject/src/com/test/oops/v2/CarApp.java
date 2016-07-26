package com.test.oops.v2;

public class CarApp {
	
	public static void main(String s[]){
		Car carObj;
		//executeCar(carObj);
		carObj = new BMW3();
		executeCar(carObj);
		
		carObj = new BMW7();
		executeCar(carObj);
		
		
		carObj = new BMW5();
		executeCar(carObj);
	}
	
	public static void executeCar(Car carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}
	
	/*public static void executeBM5(BMW5 carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}
	
	public static void executeBM3(BMW3 carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}
	
	public static void executeBM7(BMW7 carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}*/

}
