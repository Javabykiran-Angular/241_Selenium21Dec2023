package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	
	public void browserSetting(String url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		
	}
	
	 public void login(){	 
		 
//		 WebElement emailElement= driver.findElement(By.id("email"));
		 
		 WebElement emailElement=accessById("email");		 
		emailElement.sendKeys("sumit@gmail.com");	 
		
		WebElement passwordElement= accessById("password");
		passwordElement.sendKeys("123456");
		
		//driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	//	WebElement btnElement= accessByXpath("//*[@id=\"form\"]/div[3]/div/button");
		
		WebElement btnElement= accessByCssSelector("button","type","submit");
		
		btnElement.click();
		
		 
	 }
	 
	 public WebElement accessById(String id){
		 return driver.findElement(By.id(id));
	 }
	 
	 public WebElement accessByXpath(String xpath){
		 
		 return driver.findElement(By.xpath(xpath));
		 
	 }
	 
	 public WebElement accessByCssSelector(String tagname,String attr,String value){
		 
//		 return driver.findElement(By.cssSelector("button[type='submit']"));
		 
		 return driver.findElement(By.cssSelector(tagname+"["+attr+"='"+value+"']"));		 
		 
	 }
	 
	

}
