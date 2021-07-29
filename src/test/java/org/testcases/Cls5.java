package org.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cls5 {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Browser Launch");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Browser Closed");
	}

	@Test
	private void tc21() {
		System.out.println("Test Case 21");
	}

	@Test
	private void tc22() {
		System.out.println("Test Case 22");
	}

	@Test
	private void tc23() {

		System.out.println("Test Case 23");
	}

	@Test
	private void tc24() {
		System.out.println("Test Case 24");
	}

	@Test
	private void tc25() {
		System.out.println("Test Case 25");
	}
}
