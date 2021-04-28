package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import page.AccountImpl;

public class SpringMain {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/account-beans.xml");
		AccountImpl a1 = (AccountImpl) ctx.getBean("a1");

		System.out.println(a1);
		a1.withdraw(3000);

		ctx.close();

	}

}
