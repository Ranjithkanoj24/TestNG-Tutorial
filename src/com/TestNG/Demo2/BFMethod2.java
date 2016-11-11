package com.TestNG.Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BFMethod2 {

	@Test(priority=1)
	  public void tc3() {
		  System.out.println("Simply Logout");
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am Before class annotation");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am After class annotation");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am Before Test annotation");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("I am After Test annotation");
	  }
}
