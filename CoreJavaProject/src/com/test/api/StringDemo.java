package com.test.api;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Rama";
		String s1 = "Rama";//new String("Rama");
		System.out.println( " " + s1.toUpperCase());
		
		if(s.equals(s1)){//if(s == s1){
			System.out.println("Equal");
		}else{
			System.out.println("Not Erual");
		}

	}

}
