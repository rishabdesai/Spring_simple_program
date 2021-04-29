package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import page.AppConfig;
import page.Box;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();
	
		Box b1 = (Box) ctx.getBean("b1");
		System.out.println("Vol 1 = " + b1.calcVolume());
		
		Box b2 = (Box) ctx.getBean("b2");
		System.out.println("Vol 2 = " + b2.calcVolume());

	}

}
