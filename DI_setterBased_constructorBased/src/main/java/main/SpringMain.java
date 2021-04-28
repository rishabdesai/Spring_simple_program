package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import page.BoxImpl;

public class SpringMain {
	public static void main(String[] args) {

		/*
		//Initialization done by programmer - using setter, using constructor
		//object creation
		BoxImpl b1 = new BoxImpl();
		//initialization using setter
		b1.setLength(5);
		b1.setBreadth(4);
		b1.setHeight(3);
		int res1 = b1.calcVolume();
		System.out.println("volume is  : "+res1);
		
		//object creation using parameterized constructor
		BoxImpl b2 = new BoxImpl(2,3,4);
		int res2= b2.calcVolume();
		System.out.println("volume is  : "+res2);
	*/
		
	//Initialization done by spring container
		
		ClassPathXmlApplicationContext ctx;
		ctx = new ClassPathXmlApplicationContext("/box-beans.xml");
		//setter based
//		BoxImpl b3 = (BoxImpl) ctx.getBean("b3");
//		int res3 = b3.calcVolume();
//		System.out.println("volume is  : "+res3);
		
		//constructor based
		BoxImpl b4 = (BoxImpl) ctx.getBean("b4");
		int res4 = b4.calcVolume();
		System.out.println("volume is  : "+res4);
		
		ctx.close();
		
	
	
	
	
	
	}
	

}
