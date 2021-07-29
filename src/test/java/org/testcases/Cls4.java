package org.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cls4 {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Browser Launch");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Browser Closed");
	}

	@Test
	private void tc16() {
		System.out.println("Test Case 16");
	}

	@Test
	private void tc17() {
		System.out.println("Test Case 17");
	}

	@Test
	private void tc18() {
		System.out.println("Test Case 18");
	}

	@Test
	private void tc19() {
		System.out.println("Test Case 19");
	}

	@Test
	private void tc20() {
		System.out.println("Test Case 20");
	}
}
