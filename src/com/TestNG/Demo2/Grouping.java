package com.TestNG.Demo2;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping {
	@BeforeGroups(groups={"Monkey Testing"})
	public void bGroups(){
		System.out.println("I am before Groups");
	}
	
	@AfterGroups(groups={"Monkey Testing"})
	public void aGroups(){
		System.out.println("I am After Groups");
	}
  @Test(groups={"Sanity"})
  public void tc1() {
		System.out.println(" I am sanity TC");
  }
  @Test(groups={"Sanity","Regression"})
  public void tc2() {
	  System.out.println(" I am sanity & Regression TC");
  }
  @Test(groups={"Smoke Testing"})
  public void tc3() {
	  System.out.println(" I am sanity & Smoke Testing TC");
  }
  @Test(groups={"Monkey Testing"})
  public void tc4() {
	  System.out.println(" I am Monkey Testing TC");
  }
  @Test(groups={"Regression"})
  
  public void tc5() {
	  System.out.println(" I am Regression TC");
  }
  
}
