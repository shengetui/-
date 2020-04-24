package com.spring;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("----------");//↓去xml里获取
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		hellworld bean = (hellworld) ac.getBean("hell");
		bean.hell();
System.out.println("000000000000000000");
		hellworld h = new hellworld();
		h.hell();
		System.out.println("000000000000000000");

		hellworld he= factory.run();
		he.hell();
		System.out.println("000000000000000000");

		
		System.out.println("----------");//↓去xml里获取
		ApplicationContext acc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		hellworld bea = (hellworld) acc.getBean("factory");
		bea.hell();
		System.out.println("000000000000000000");

		ApplicationContext accc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		hellworld be = (hellworld) accc.getBean("id3");
		be.hell();
	}

}
