package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/application.xml");
		
		Employee e1 = (Employee) ctx.getBean("e");
		e1.display();
		
		Address address = (Address) ctx.getBean("a");
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println("-------Finish--------");
	}
}
