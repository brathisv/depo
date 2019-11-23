package com.brathisv.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextExample {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ctx.registerShutdownHook(); // will destroy all the beans 
		Triangle triangle = ctx.getBean("tri", Triangle.class);
		triangle.draw();
		
		Circle bean = (Circle) ctx.getBean("cir");
		bean.draw();
		// ctx.close();
	}

}
