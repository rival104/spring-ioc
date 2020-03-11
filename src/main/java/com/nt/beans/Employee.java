package com.nt.beans;

public class Employee {
	String[] emps;
	
	public void setEmps(String[] emps) {
		this.emps = emps;
	}
	public void display() {
		for(String e: emps) {
			System.out.println(e);
		}
	}
}
