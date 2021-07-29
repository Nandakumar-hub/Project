package org.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cls1 {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Browser Launch");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Browser Closed");
	}

	@Ignore
	@Test
	@Parameters({ "name", "dob", "location" })
	private void tc1(String name, String dob, String location) {
		System.out.println("Test Case 1");
		System.out.println("name:" + name);
		System.out.println("dob:" + dob);
		System.out.println("location:" + location);
	}

	@Test
	private void tc2() {
		System.out.println("Test Case 2");
	}

	@Test (invocationCount=2)
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test(priority=-1)
	private void tc4() {
		System.out.println("Test Case 4");
	}
	
	@Ignore
	@Test
	private void tc5() {
		System.out.println("Test Case 5");
	}

}
