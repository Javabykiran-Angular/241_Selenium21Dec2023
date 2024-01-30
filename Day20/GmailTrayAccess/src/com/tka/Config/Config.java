package com.tka.Config;

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
	
	public void gmailTrayAccess() {
		
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		driver.switchTo().frame("app");
//		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[7]/a/div[5]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[7]/a")).click();
		
		driver.switchTo().defaultContent();
		
	}
	
	
	

}
