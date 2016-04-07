package com.example.ioc_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc_xml.xml");
		Mart mart = (Mart)context.getBean("mart");
		mart.order();
	}

}
