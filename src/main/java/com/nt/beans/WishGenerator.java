package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	Date dt;
	public void setdt(Date dt) {
		System.out.println(dt);
		this.dt = dt;
	}
	public void wish() {
		int hr = dt.getHours();
		if(hr < 12) System.out.println("GM");
		else System.out.println("GN");
	}
}
