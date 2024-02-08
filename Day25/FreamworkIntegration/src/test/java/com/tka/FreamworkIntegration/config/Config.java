package com.tka.FreamworkIntegration.config;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String Url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(Url);
	}
	
	public String readPropertyFile() {
		String url=null;
		FileInputStream fis=null;
		Properties props=null;
		
		try {
		
			fis=new FileInputStream("D:\\241_Selenium\\configData\\myfile.properties");
		
			props=new Properties();
			
			props.load(fis);
			
			url=props.getProperty("jbkurl");
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
					fis=null;
				}
				if(props!=null) {
					
					props=null;
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		return url;
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	

}
