package com.TestNG.Demo1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario {
  @BeforeMethod
  public void Login() {
	  System.out.println("I am Login Method of Scenario class");
  }
  @AfterMethod
  public void Logout() {
	  System.out.println("I am Logout Method of Scenario class");
  }
  @Test()
  public void search() {
	  System.out.println("I am Search Method of Scenario class");
	  //Assert.assertEquals("abc", "ABC");
  }
  
  @Test(dependsOnMethods={"search"})
  public void advancedSearch() {
	  System.out.println("I am advancedSearch Method of Scenario class");
  }
  @Test(dependsOnMethods={"advancedSearch"})
  public void buyProducts() {
	  System.out.println("I am buyProducts Method of Scenario class");
  }
  
}
