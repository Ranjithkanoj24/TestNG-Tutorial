package com.TestNG.Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
	@Test
  public void Login() {
		System.out.println("I am Login Method");
  }
  
  @Test(dependsOnMethods={"Login"})
  public void enterTheText() {
	  System.out.println("I am enterTheText Method");
	  Assert.assertEquals("abc", "ABC");
  }
  
  @Test(dependsOnMethods={"enterTheText"})
  public void search() {
	  System.out.println("I am search method");
  }
  
  @Test(dependsOnMethods={"search"})
  public void Logout(){
	  System.out.println("I am Logout method");
  }
  
}
