package com.test.dao;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private int sno;
	private String sname;
	private String course;
	private int age;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

	public StudentDTO(int sno, String sname, String course, int age) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StudentDTO() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", course="
				+ course + ", age=" + age + "]";
	}

}
