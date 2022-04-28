package com.sample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Test1.class,Test2.class})

public class SuiteTest {
	
	public static void main(String[] args) {
		
		Result r = JUnitCore.runClasses(Test1.class,Test2.class);
		
		int count = r.getRunCount();
		System.out.println(count);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}
		
		
		
		
		
		
	} 

}
