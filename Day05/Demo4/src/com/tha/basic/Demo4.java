package com.tha.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/dashboard.html");
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sumit");
		
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9960556397");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@thekiranacademy.com");
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		
		WebElement dropDownElement= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		Select select=new Select(dropDownElement);
		
//			select.selectByIndex(1);
		
//		select.selectByValue("Delhi");
		
		select.selectByVisibleText("HP");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys(" 789654123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		

	}

}
