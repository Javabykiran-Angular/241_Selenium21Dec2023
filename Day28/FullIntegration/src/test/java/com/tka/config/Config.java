package com.tka.config;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

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
	
	public Object[][] readExcelFile() {
		FileInputStream fis=null;
		XSSFWorkbook workbook=null;
		String[][] tabArray=null;
		int ci,cj;
		
		try {
		fis=new FileInputStream("D:\\241_Selenium\\testData\\testdata.xlsx");
		
		workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		tabArray=new String[rowcount+1][2];
		ci=0;
		for(int i=0;i<=rowcount;i++,ci++) {
			XSSFRow row= sheet.getRow(i);
			
			int collCount= row.getLastCellNum();
			cj=0;
			for(int j=0;j<collCount;j++,cj++) {
				XSSFCell cell= row.getCell(j);
				
//				System.out.println("Cell data "+cell.getStringCellValue());
				
				tabArray[ci][cj]=cell.getStringCellValue();
				
				
			}
			
			
			
		}
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(workbook!=null) {
					workbook.close();
					workbook=null;
				}
				
				if(fis!=null) {
					fis.close();
					fis=null;
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		return tabArray;
		
		
	}
	
	public WebElement accessById(String id) {
			
		return driver.findElement(By.id(id));
		
	}
	
	public WebElement accessByxpath(String xpath) {
		
		return driver.findElement(By.xpath(xpath));
		
	}
	
	
	

}
