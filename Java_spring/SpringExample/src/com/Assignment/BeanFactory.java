package com.Assignment;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beanfactory.xml")); 
		Student s=(Student) factory.getBean("stu");
   s.Display();
	}

}