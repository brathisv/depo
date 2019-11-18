package com.brathisv.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextExample {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangle = ctx.getBean("tri", Triangle.class);
		triangle.draw();
		
		Circle bean = (Circle) ctx.getBean("cir");
		bean.draw();
	}

}
