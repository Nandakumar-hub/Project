package org.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cls2 {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Browser Launch");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Browser Closed");
	}

	@Test
	private void tc6() {
		System.out.println("Test Case 6");
	}

	@Test
	private void tc7() {
		System.out.println("Test Case 7");
	}

	@Test
	private void tc8() {
		System.out.println("Test Case 8");
	}

	@Test
	private void tc9() {
		System.out.println("Test Case 9");
	}

	@Test
	private void tc10() {
		System.out.println("Test Case 10");
	}

}
