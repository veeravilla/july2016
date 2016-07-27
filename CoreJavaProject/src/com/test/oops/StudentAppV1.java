package com.test.oops;

public class StudentAppV1 {

	public static void main(String[] args) {
		//First Object
		Student stuObj1 = new Student(999,"Tim",3600);
		
		//Second Object
		Student stuObj2 = new Student(999,"Tim1",3500);
		
		if(stuObj1.equals(stuObj2)){
			System.out.println("Equal !!");
		}else{
			System.out.println("Not Equal !!");	
		}
		
	}

}
