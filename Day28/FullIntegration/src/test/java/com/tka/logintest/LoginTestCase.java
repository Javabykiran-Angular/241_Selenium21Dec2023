package com.tka.logintest;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tka.config.Config;

public class LoginTestCase extends Config
{
	String Url=null;
	WebElement emailElement=null;
	WebElement passwordElement=null;
	
	@BeforeTest
	public void accessUrl() {
		Url=readPropertyFile();
	}
	
	@BeforeClass
	public void openBrowser() {
		browserSetting(Url);
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		emailElement=accessById("email");
		passwordElement=accessById("password");
		emailElement.clear();
		passwordElement.clear();
	}
	
	@Test(priority =1,dataProvider = "logintestdata" )
	public void loginTest(String username,String password) {
//		System.out.println("Login Test "+username+" pwd "+password);
		
//		emailElement=accessById("email");
		emailElement.sendKeys(username);
//		passwordElement=accessById("password");
		passwordElement.sendKeys(password);
		
		WebElement btnElement=accessByxpath("//button[@type='submit']");
		btnElement.click();		
		
		File source=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		
		File target=new File("D:\\241_Selenium\\images\\login_"+username+".png");
		try {
			FileHandler.copy(source, target);
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		WebElement emailErrorElement= accessById("email_error");
		String emailActulaErrorResult=emailErrorElement.getText();
		String emailExpectedResult="Please enter email as kiran@gmail.com";
		
		WebElement passwordErrorElement= accessById("password_error");
		String passwordActulaErrorResult=passwordErrorElement.getText();
		String passwordExpectedResult="Please enter password 123456";
		
		SoftAssert asset=new SoftAssert();
		
		asset.assertEquals(emailActulaErrorResult, emailExpectedResult);
		
		asset.assertEquals(passwordActulaErrorResult, passwordExpectedResult);
		
		asset.assertAll();
		
		
	}
	
	@DataProvider(name = "logintestdata")
	public Object[][] testdata(){
		Object[][] obj=readExcelFile();
		return obj;
	}
	
	
}
