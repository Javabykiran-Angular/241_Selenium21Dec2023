package com.tha.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	WebDriver driver;
	
//	public void browserSetting(String url) {
//		
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		
//		driver=new ChromeDriver();
//		
//		driver.get(url);
//		
//	}
	
	public void browserSetting() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(readURLFromPropertyFile());
		
	}
	
	public void readPropertyFile() {
		
		try {
			FileInputStream fis= new FileInputStream("D:\\241_Selenium\\configData\\myfile.properties");
		
			Properties props=new Properties();
			props.load(fis);
			
			System.out.println("Username => "+props.getProperty("username"));
			System.out.println("Password => "+props.getProperty("password"));
			System.out.println("URl=> "+props.getProperty("url"));
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
	}
	
	
	public String readURLFromPropertyFile() {
		String url1=null;
		try {
		FileInputStream fis= new FileInputStream("D:\\241_Selenium\\configData\\myfile.properties");
		
		Properties props=new Properties();
		props.load(fis);
		
		url1=props.getProperty("url");
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return url1;
		
		
	}
	
	
	

}
