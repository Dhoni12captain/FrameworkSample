package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngSample2 {
	
	

	@Parameters({"username1","password1"})
	@Test
	private void tc04(String s2,String s3) {
		System.out.println(s2);
		System.out.println(s3);

	}
	
	

}
