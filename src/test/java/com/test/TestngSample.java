package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngSample {
	
	

	@Parameters({"username","password"})
	@Test
	private void tc01(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	@Test
	private void tc03()  {
		System.out.println("method 3");

	}
	
	

}
