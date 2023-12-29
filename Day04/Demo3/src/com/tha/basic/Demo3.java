package com.tha.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		WebElement labelElement= driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
		
		 String strData= labelElement.getText();
		 System.out.println("==> "+strData);
		 
		 WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 
		 emailElement.sendKeys("kiran@gmail.com");
		 
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		 
		String courseStr= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small")).getText();
		System.out.println("=> "+courseStr);
		 
		 
		
		

	}

}
