package com.TestNG.Demo2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BFMethod {
  @Test(priority=3)
  public void tc1() {
	  System.out.println(" Login to app");
  }
  @Test(priority=2)
  public void tc2() {
	  System.out.println(" Perform some operation");
  }
  @Test(priority=1)
  public void tc3() {
	  System.out.println("Simply Logout");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am Before Method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am After Method annotation");
  }
  @BeforeSuite
  public void bSuite(){
	  System.out.println("I am before suite");
  }

  @AfterSuite
  public void aSuite(){
	  System.out.println("I am After suite");
  }
}
