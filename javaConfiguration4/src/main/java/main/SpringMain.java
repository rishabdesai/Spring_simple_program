package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import page.Account;
import page.AppConfig;
import page.Passbook;

public class SpringMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();
		
		Account a1 = (Account) ctx.getBean("accountImpl");
//		a1.setAccId(1);
//		a1.setType("Saving");
//		a1.setBalance(1000.00);
		a1.getAccHolder().setName("Steve");
		a1.getAccHolder().setAddr("US");
		a1.getAccHolder().setAge(65);
//		System.out.println(a1);

		
		Passbook pb1 = (Passbook) ctx.getBean("passbookImpl");
		System.out.println(pb1);
	}

}
