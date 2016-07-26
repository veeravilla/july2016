package com.test.examples;

public class MethodDemoApp {

	public static void main(String[] args) {
		//calculateTax(4567);
		//calculateTax(2344);
		//calculateTax(1234);
		
		double tax1 = getTax(5600);
		double tax2 = getTax(45345);
		double tax3 = getTax(2323);
		
		System.out.println(" Total Tax Amount " + (tax1+tax2+tax3));
	}
	
	
	public static void calculateTax(double salary){
		double tax = salary*0.3;
		System.out.println(" Tax Amount :: " + tax);
	}
	
	public static double getTax(double salary){
		calculateTax(salary);
		
		double tax = salary*0.3;
		return tax;
	}

}
