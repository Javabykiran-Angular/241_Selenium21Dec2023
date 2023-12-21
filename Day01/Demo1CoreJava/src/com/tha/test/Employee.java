package com.tha.test;

public class Employee {
	
	int id;
	String name;
	
	public Employee() {
		System.out.println("no Argument Constructor");
	}
	
	public Employee(int id,String n) {
		this.id=id;
		this.name=n;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Id :: "+id);
		System.out.println("Name :: "+this.name);
	}
	
	

}
