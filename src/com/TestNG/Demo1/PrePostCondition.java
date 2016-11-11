package com.TestNG.Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PrePostCondition {
	 @BeforeSuite
	  public void Login() {
		  System.out.println("I am Login Method of PrePostCondition class");
	  }
	  @AfterSuite
	  public void Logout() {
		  System.out.println("I am Logout Method of PrePostCondition class");
	  }
	  @Test()
	  public void search() {
		  System.out.println("I am Search Method of PrePostCondition class");
		  //Assert.assertEquals("abc", "ABC");
	  }
	  
	  @Test(dependsOnMethods={"search"})
	  public void advancedSearch() {
		  System.out.println("I am advancedSearch Method of PrePostCondition class");
	  }
	  @Test(dependsOnMethods={"advancedSearch"})
	  public void buyProducts() {
		  System.out.println("I am buyProducts Method of PrePostCondition class");
	  }
}
