package com.darshitpatel.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.darshitpatel.springdemo.domain.Organization;
import com.darshitpatel.springdemo.domain.promotion.TradeFair;

public class AutowiredAnnotationApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		TradeFair tradeFair = (TradeFair) ctx.getBean("myFair");
		System.out.println(tradeFair.specialPromotionPricing());

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
