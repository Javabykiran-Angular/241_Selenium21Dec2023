package com.tha.config;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
	}
	
	public void wait_iframe() {
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("webform");
		
//		WebDriverWait wait=new WebDriverWait(driver,TimeUnit.SECONDS,5);
		
		//Explict Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("webform[email]")));
		
		element.sendKeys("sumit@gmail.com");
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("webform[email]")));
//		element.sendKeys("sumit@gmail.com");
		
//		driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		
		
	}
	

}
