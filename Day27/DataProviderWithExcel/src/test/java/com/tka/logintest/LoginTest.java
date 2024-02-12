package com.tka.logintest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tka.config.Config;

public class LoginTest extends Config {
	
	@Test(priority = 1,dataProvider = "testdata")
	public void LoginTest(String username,String pwd) {
		
		System.out.println("Username :: "+username);
		System.out.println("Password :: "+pwd);
		
	}
	
	@DataProvider(name = "testdata")
	public Object[][] loginTestdata(){
		
		Object[][] obj=readExcelFile();
		
		return obj;
		
	}

}
