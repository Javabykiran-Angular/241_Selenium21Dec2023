package com.tha.config;

import java.util.List;

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
	
	public void userTable() {
		
	List<WebElement> rowList= driver.findElements(By.tagName("tr"));
	System.out.println("Count of row "+rowList.size());
	
	for(int i=0;i<rowList.size();i++) {
		
		WebElement row=rowList.get(i);
		List<WebElement> colList;
		
		if(i==0) {
			colList= row.findElements(By.tagName("th"));
		}else {
			colList= row.findElements(By.tagName("td"));
		}
		
	//	List<WebElement> headelist= row.findElements(By.tagName("th"));
		
		//List<WebElement> colList= row.findElements(By.tagName("td"));
		
		for(int j=0;j<8;j++) {
		//	WebElement head=headelist.get(j);
		//	System.out.print("\t"+head.getText());
			WebElement col=colList.get(j);
			System.out.print("\t"+col.getText());
		}
		System.out.println("\n------------------------");
		
	}
		
	}
	
	
}
