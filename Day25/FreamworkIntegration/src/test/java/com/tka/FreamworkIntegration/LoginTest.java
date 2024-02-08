package com.tka.FreamworkIntegration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tka.FreamworkIntegration.config.Config;

public class LoginTest extends Config {
	String Url=null;
	
	@BeforeTest
	public void beforeTest() {
		Url=readPropertyFile();
	}
	
	@BeforeClass
	public void beforeClass() {
		browserSetting(Url);
	}
	
	@Test(priority = 1)
	public void usernameTest() {
		System.out.println("U r in usernameTest");
	}
	
	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
	

}
