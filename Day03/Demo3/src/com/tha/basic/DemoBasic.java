package com.tha.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/JavaByKiranSelenium/Selenium%20Softwares/Offline%20Website/index.html");
		
		String strTitle= driver.getTitle();
		
		System.out.println("Title is => "+strTitle);
		
		String strUrl= driver.getCurrentUrl();
		System.out.println("Current Url => "+strUrl);
		
		 String strPageSource=driver.getPageSource();
		 System.out.println("Page Source "+strPageSource);
		

	}

}
