package com.sample;

import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
	@Test
	public void tc01() {
		System.out.println("Test case 1");

	}
@Ignore
	@Test
	public void tc02() {
		System.out.println("Test case 2");

	}
@Test
public void tc03() {
	System.out.println("Test case 3");
}
@Test
private void tc04() {
	System.out.println("Test case 4");

}

}
