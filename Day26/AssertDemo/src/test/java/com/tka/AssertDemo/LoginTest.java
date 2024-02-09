package com.tka.AssertDemo;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tka.config.Config;

public class LoginTest extends Config {
	String Url=null;
	
	@BeforeTest
	public void readUrl() {
		Url= readPropertyFile();
	}
	
	@BeforeClass
	public void openBrowser() {
		browserSetting(Url);
	}
	
	@Test(priority = 1)
	public void usernameTest() {
		WebElement emailElement= accessById("email");
		emailElement.sendKeys("abc@gmail.com");
	}
	
	@Test(priority = 2)
	public void passwordTest() {
		WebElement passwordElement= accessById("password");
		passwordElement.sendKeys("1234");
	}
	
	@Test(priority = 3)
	public void btnClickTest() {
		
		WebElement btnElement= accessByXpath("//button[@type='submit']");
		btnElement.click();
		
		WebElement emailErrorEelement= accessById("email_error");
		String actualResult= emailErrorEelement.getText();
		String expectedResult="Please enter email as kiran@gmail.com";
		
//		System.out.println("------- Before Assert Method---------");
//		Assert.assertEquals(actualResult, expectedResult);
//		System.out.println("------- After Assert Method---------");
		
		SoftAssert softassert= new SoftAssert();
		
		softassert.assertEquals(actualResult, expectedResult);
		
		WebElement passwordErrorElement=accessById("password_error");
		
		String actulaPwdResult= passwordErrorElement.getText();
		String expectedPwdResult="Please enter password 123456";
		
		softassert.assertEquals(actulaPwdResult, expectedPwdResult);
		
		
		softassert.assertAll();
		
		
		
	}

}
