package com.test.oops;

public class StudentApp {

	public static void main(String[] args) {
		//First Object
		Student stuObj = new Student(101);
		stuObj.setSname("Jhon");
		stuObj.setFee(3500);
		
		//Second Object
		Student stuObj2 = new Student(999,"Tim",3500);
		
		System.out.println(" to String : Obj1 " + stuObj);
		
		System.out.println(" to String : Obj2 " + stuObj2);
		
		String name="Rama";
		
		System.out.println(" to String : String Obj " + name);
	}

}
