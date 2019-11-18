package com.brathisv.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
		Triangle shape = factory.getBean("triangle", Triangle.class);
		shape.draw();
	}

}
