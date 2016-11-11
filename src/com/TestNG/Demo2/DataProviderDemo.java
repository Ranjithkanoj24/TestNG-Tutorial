package com.TestNG.Demo2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="Credentials")
	public void getValue(String fName, String lName){
		System.out.println("First name is : " + fName + " last name is : " + lName);
	}
	
	@DataProvider(name="Credentials")
	public Object[][] sendValue(){
		
		Object[][] value = new Object[3][2];
		
		value[0][0] = "Ranjith";
		value[0][1] = "Kumar";
		
		value[1][0] = "Ranjith";
		value[1][1] = "Kumar";
		
		value[2][0] = "Ranjith";
		value[2][1] = "Kumar";
		return value;
	}

}
