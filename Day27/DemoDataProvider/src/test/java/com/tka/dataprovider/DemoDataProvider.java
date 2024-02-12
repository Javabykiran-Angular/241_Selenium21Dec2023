package com.tka.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(priority = 1,dataProvider = "loginTestData")
	public void loginTest(int id,String username,String pwd) {
		System.out.println("U r in LoginTest ");
		System.out.println("Id => "+id);
		System.out.println("Username => "+username);
		System.out.println("Password => "+pwd);
	}
	
	@DataProvider(name = "loginTestData")
	public Object[][] testData() {
		
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spruha","456"},
			{6,"Kiran","789"}
			
		};
		
		
	}
	

}
