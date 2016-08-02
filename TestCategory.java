package com.home;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {
	
	public static void main(String[]args){
		
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.scan("com.Home");
		context.refresh();
		
		context.getBean("category");
		System.out.println("Bean created successfully");
		
	}
	

}
