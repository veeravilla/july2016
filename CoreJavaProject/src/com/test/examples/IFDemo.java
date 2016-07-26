package com.test.examples;

public class IFDemo {

	public static void main(String[] args) {
		int a=10;
		int b=78;
		int c=98;
		
		if(a>b && a>c){
			System.out.println("A is Big");
			System.out.println("A");
		}else if(b > c)
			System.out.println("B is Big");
		else
			System.out.println("C is Big");
		
		
		int big = (a>b && a>c) ? a : ((b > c) ? b : c);
		
		System.out.println(" Big " + big);

	}

}
