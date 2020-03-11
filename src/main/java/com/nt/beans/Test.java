package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/application.xml");
		
//		WishGenerator w1 = (WishGenerator) ctx.getBean("w");
//		w1.wish();
	}
}
