package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import page.AppConfig;
import page.PrototypeBean;
import page.SingletonBean;


public class SpringMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();
		
		SingletonBean p1 = ctx.getBean(SingletonBean.class);
		SingletonBean p2 = ctx.getBean(SingletonBean.class);
		System.out.println("PrototypeBean are same : " + (p1==p2));
		System.out.println("Inner SingletonBean are same : " 
				+ (p1.getInnerBean()==p2.getInnerBean()));
		
		
		
	}

}
