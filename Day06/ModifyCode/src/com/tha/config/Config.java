package com.tha.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
//		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		driver.get(url);
		
		
	}
	
	
	

}
