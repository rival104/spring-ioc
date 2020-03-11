package com.nt.beans;

public class Employee {
	int id;
	String name;
	int sal;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void display(){
		System.out.println(id+" "+name+" "+sal);
	}
	
}
