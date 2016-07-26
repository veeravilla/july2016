package com.test.oops;

import com.test.examples.MethodDemoApp;

public class PenApp {

	public static void main(String[] args) {
		
		MethodDemoApp.calculateTax(7667);
		
		//First Pen
		Pen penObj = new Pen(9876);
		//penObj.inkColor="Red";
		//penObj.penID=1000;
		
		penObj.setInkColor("Red");
		//penObj.setPenID(1200);
		penObj.write();
		
		
		//Second Pen
		Pen penObj2 = new Pen(3212,"Blue");
		//penObj2.inkColor="Green";
		//penObj2.penID=6654;
		//penObj2.setInkColor("Green");
		//penObj2.setPenID(6500);
		penObj2.setInkColor("Green");
				
		penObj2.write();

	}

}
