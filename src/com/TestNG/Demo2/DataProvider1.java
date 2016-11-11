package com.TestNG.Demo2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider1 {
  @Test(dataProvider="Credentials")
  public void printData(String fName, String lName) {
	  System.out.println("The first name of the canditate is : " +fName );
	  System.out.println("The last name of the canditate is : " +lName );
	  
  }
  
  @DataProvider(name="Credentials")
  public static Object[][] passData(){
		Object [] [] credentials = new Object[3][2];
		credentials[0][0] = "Ranjith";
		credentials[0][1] = "Kumar";
		
		credentials[1][0] = "Shruthi";
		credentials[1][1] = "Ranjith";
		
		credentials[2][0] = "Lucky";
		credentials[2][1] = "Lakshman";
		return credentials;
	}
}
