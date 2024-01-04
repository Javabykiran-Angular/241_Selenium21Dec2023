package com.tha.config;

import java.util.List;

import org.openqa.selenium.Alert;
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
	
	public void locators() {
		
//		driver.findElement(By.linkText("Register a new membership")).click();
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("Sumit");
		driver.findElement(By.name("mobile")).sendKeys("9960556397");
		
			
		
		 List<WebElement> list= driver.findElements(By.tagName("input"));
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++) {
			 
			 WebElement element= list.get(i);
			 
			 if(element.getAttribute("placeholder").equalsIgnoreCase("Email")) {
				 element.sendKeys("sumit@gmail.com");
			 }else if(element.getAttribute("placeholder").equalsIgnoreCase("Password")) {
				 element.sendKeys("12345");
			 }		 
			 
		 }
		 
		 
		 driver.findElement(By.className("btn")).click();
		 
		 Alert  alert= driver.switchTo().alert();
		 alert.accept();
		 
		 driver.switchTo().defaultContent();
		 
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 driver.navigate().back();
		 
		 driver.findElement(By.cssSelector("#email")).sendKeys("sumit@thekiranacademy");
		 driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		
		
		
	}
	

}
