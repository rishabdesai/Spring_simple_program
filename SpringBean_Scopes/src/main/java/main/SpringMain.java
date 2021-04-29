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
		
		SingletonBean s1 = ctx.getBean(SingletonBean.class);
		SingletonBean s2 = ctx.getBean(SingletonBean.class);
		System.out.println("Singleton Beans are same : " + (s1==s2));

		PrototypeBean p1 = ctx.getBean(PrototypeBean.class);
		PrototypeBean p2 = ctx.getBean(PrototypeBean.class);
		System.out.println("Prototype Beans are same : " + (p1==p2));
		
		p1.destroy();
		p2.destroy();
		
		
		
	}

}
