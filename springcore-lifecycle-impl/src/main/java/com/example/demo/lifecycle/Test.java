package com.example.demo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		context.registerShutdownHook();
		Samosa bean = (Samosa) context.getBean("s1");
		System.out.println(bean);
		
		System.out.println("==============");
		
		Pepsi bean2 = (Pepsi) context.getBean("p1");
		System.out.println(bean2);

	}

}
