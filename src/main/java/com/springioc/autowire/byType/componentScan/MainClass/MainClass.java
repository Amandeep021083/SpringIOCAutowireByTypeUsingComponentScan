package com.springioc.autowire.byType.componentScan.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.autowire.byType.componentScan.User;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println("name= "+user.getCar().getName() + " cost= "+user.getCar().getCost());
	}

}
