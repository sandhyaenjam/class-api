package com.encapsulation;

public class StudentInfo { 
	private String studentFirstName;
	private String studentLastName;
	private String fatherName;
	private  int studentId;
	private int age;
	//private dateofbirth

	

	public String getStudentFirstName() {
		return studentFirstName;
	}


	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}


	public String getStudentLastName() {
		return studentLastName;
	}


	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
    public int getAge() {
    	 return age;
    }
    
    
    public void setAge(int age) {
    	 this.age =age;
    }

	 
}