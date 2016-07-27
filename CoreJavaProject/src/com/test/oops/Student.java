package com.test.oops;

public class Student {

	private int sno;
	private String sname;
	private double fee;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(" Equals () ... ");
		if(obj instanceof Student){
			Student stuObj = (Student) obj;
			if( this.sno == stuObj.getSno() && this.sname.equals(stuObj.getSname())){
				return true;
			}
		}
		return false;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Student(int sno, String sname, double fee) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.fee = fee;
	}

	public Student(int sno) {
		super();
		this.sno = sno;
	}

	public Student() {
		super();
	}

	//@Override
	public String toString() {
		return "Student [ sno : " + sno + " , sname : "+sname + ", Fee : "+ fee + " ]"; 
	}

}
