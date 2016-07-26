package com.test.oops.v1;

public class CarApp {
	
	public static void main(String s[]){
		//Car carObj = new Car();
		//executeCar(carObj);
		BMW3 bm3 = new BMW3();
		executeBM3(bm3);
		
		BMW7 bm7 = new BMW7();
		executeBM7(bm7);
		
		
		BMW5 bm5 = new BMW5();
		executeBM5(bm5);
	}
	
	/*public static void executeCar(Car carObj){
		carObj.start();
		carObj.move();
		carObj.stop();
	}*/
	
	public static void executeBM5(BMW5 carObj){
		carObj.bm5Start();
		carObj.move();
		carObj.stop();
	}
	
	public static void executeBM3(BMW3 carObj){
		carObj.bm3Start();
		carObj.move();
		carObj.stop();
	}
	
	public static void executeBM7(BMW7 carObj){
		carObj.bm7Start();
		carObj.move();
		carObj.stop();
	}

}
