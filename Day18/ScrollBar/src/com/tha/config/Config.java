package com.tha.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(readProperty());
		
	}
	
	public String readProperty() {
		String url=null;
		FileInputStream fis=null;
		try {
		 fis=new FileInputStream("D:\\241_Selenium\\configData\\myfile.properties");
		
		Properties props=new Properties();
		props.load(fis);
		
		url=props.getProperty("redifurl");
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fis=null;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return url;
		
	}
	
	public void scrollPage() {
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		try {
			Thread.sleep(5000);
			
			action.sendKeys(Keys.PAGE_UP).build().perform();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public void accessScrollBarWebElement() {
		
		driver.findElement(By.id("lbl_txt")).click();
		WebElement element= driver.findElement(By.cssSelector("#country_id>ul>li:nth-child(100)"));
		//	try {
//			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
//		
			//Thread.sleep(5000);
			
//			Actions act=new Actions(driver);
//			act.moveToElement(element);
//		//	
//				act.sendKeys(Keys.DOWN).perform();
			
		/*
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
		
	}
	
	
	

}
