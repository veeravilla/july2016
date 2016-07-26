package com.test.examples;

public class ArgumentsDemoApp {

	public static void main(String[] args) {
		System.out.println(" Total Params : === " + args.length);
		System.out.println(" args[0] " + args[0]);
		System.out.println(" args[1] " + args[1]);
		System.out.println(" args[2] " + args[2]);
		
		System.out.println("Sno Name :" + System.getProperty("sno.name"));
		demoParam(args);
	}
	
	//Demo Method
	public static void demoParam(String[] args){
		//System.out.println(" args[2] " + args[2]);
		System.out.println("Client Name  :: " + System.getProperty("clientName"));
	}
	
}
