package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import page.AppConfig;
import page.PrototypeBean;
import page.SingletonBean;


public class SpringMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//ctx.registerShutdownHook();
		
		SingletonBean s1 = ctx.getBean(SingletonBean.class);
		SingletonBean s2 = ctx.getBean(SingletonBean.class);
		System.out.println("PrototypeBean are same : " + (s1==s2));
		System.out.println("Inner SingletonBean are same : " 
				+ (s1.getInnerBean()==s2.getInnerBean()));
		
		
		ctx.close();
	}

}
