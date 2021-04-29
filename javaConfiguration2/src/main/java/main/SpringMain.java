package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import page.AppConfig;
import page.Circle;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();
	

		Circle c1 = (Circle) ctx.getBean("c1");
		c1.setRadius(7);
		System.out.println("Area 1 = " + c1.calcArea());
	}

}
