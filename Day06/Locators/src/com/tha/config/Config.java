package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
	}
	
	public void locators() {
		
//		driver.findElement(By.linkText("Register a new membership")).click();
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("Sumit");
		driver.findElement(By.name("mobile")).sendKeys("9960556397");
		
		
		
	}
	

}
