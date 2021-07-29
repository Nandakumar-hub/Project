package org.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cls3 {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Browser Launch");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Browser Closed");
	}

	@Test
	private void tc11() {
		System.out.println("Test Case 11");
	}

	@Test
	private void tc12() {
		System.out.println("Test Case 12");
	}

	@Test
	private void tc13() {
		System.out.println("Test Case 13");
	}

	@Test
	private void tc14() {
		System.out.println("Test Case 14");
	}

	@Test
	private void tc15() {
		System.out.println("Test Case 15");
	}

}
