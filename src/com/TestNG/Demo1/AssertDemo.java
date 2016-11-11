package com.TestNG.Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
  @Test
  public void tc3() {
	  Assert.assertEquals("Ranjith", "Ranjith");
  }
  @Test
  public void tc1(){
	  Assert.assertEquals("Ranjith", "Shruthi");
  }
  @Test
  public void tc2(){
	  Assert.assertEquals("Ranjith", "ranjith");
	  
  }
  
}
