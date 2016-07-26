package com.test.oops;

public class Pen {
	
	private String inkColor;
	private int penID;
	
	/*public Pen(){
		System.out.println("Pen Constructor !!!!");
	}*/
	
	public Pen(int penID){
		this.penID = penID;
	}
	
	public Pen(int penID,String inkColor){
		this.penID = penID;
		this.inkColor = inkColor;
	}
	
	public void write(){
		System.out.println(" inkColor : " + inkColor + " penID : " + penID);
	}
	
	public void setInkColor(String inkColor){
		// B.L
		System.out.println(" Previous Ink Color " + this.inkColor);
		this.inkColor = inkColor;
		System.out.println(" Updated  Ink Color " + inkColor );
	}
	
	public String getInkColor(){
		return  inkColor;
	}

	public int getPenID() {
		return penID;
	}

	public void setPenID(int penID) {
		this.penID = penID;
	}

}
