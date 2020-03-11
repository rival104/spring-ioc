package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/application.xml");
		
		Resource res = new FileSystemResource("src/main/resources/application.xml");
		BeanFactory ctx = new XmlBeanFactory(res);
		
		Employee e1 = (Employee) ctx.getBean("e");
		Employee e2 = (Employee) ctx.getBean("e");	
		
		Address adr1 = (Address) ctx.getBean("a");
		Address adr2 = (Address) ctx.getBean("a");
		
		System.out.println("\nEmployee hashcode");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("Address hashcode");
		System.out.println(adr1.hashCode());
		System.out.println(adr2.hashCode());
		System.out.println("-------Finish--------");
	}
}
