package com.nt.beans;

public class Address {
	String country;
	String state;
	public Address() {
		System.out.println("Address Constructor.");
	}
	public Address(String country, String state) {
		this.country = country;
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
}
