package com.example.StudentDetailsModel;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection="Student_Details")
public class Students {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	
	private String studentname;
	private int salary;
	private int age;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [studentname=" + studentname + ", salary=" + salary + ", age=" + age + "]";
	}
	public Students() {
		//Empty constructor//
	}
	public Students(String studentname, int salary, int age) {
		super();
		this.studentname = studentname;
		this.salary = salary;
		this.age = age;
	}
	
	
	
}
