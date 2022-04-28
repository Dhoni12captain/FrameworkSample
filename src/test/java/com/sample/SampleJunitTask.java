package com.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunitTask {

//	@BeforeClass
//	public static void beforeClass() {
//		System.out.println("Before Class");
//
//	}
//
//	@Before
//	public void before() {
//		System.out.println("It will execute before each test case");
//
//	}
//
//	@After
//	public void after() {
//		System.out.println("It will execute after each test case");
//
//	}
//
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("After Class");
//
//	}
//
//	@Test
//	public void tc01() {
//		System.out.println("Test case 1");
//	}
//
//	@Test
//	public void tc02() {
//		System.out.println("Test case 2");
//	}

	@Test
	public void tc0() {
		String s = "Dhoni";
		System.out.println(s);
		Assert.assertNotEquals("dhoni", "Dhoni");
		
		System.out.println("captain cool");
		System.out.println("csk");
	}
	 
	@Test
	public void tc01() {
		System.out.println("Test case 1");
	}
	
	
	
	
	
	
	

}
