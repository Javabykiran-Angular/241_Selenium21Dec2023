package com.tka.config;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
	public void readExcelSheet() {
		
		try {
		
		FileInputStream fis=new FileInputStream("D:\\241_Selenium\\testData\\logindata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		System.out.println("Cell data => "+cell.getStringCellValue());
		
		
		
		workbook.close();
		fis.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	public void readExcelSheetUsingFor() {
		XSSFWorkbook workbook=null;
		FileInputStream fis=null;
		
		try {
		
		 fis=new FileInputStream("D:\\241_Selenium\\testData\\logindata.xlsx");
		 workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowno= sheet.getLastRowNum();
		
		for(int i=0;i<=rowno;i++) {
			XSSFRow row=sheet.getRow(i);
			
			int colno=row.getLastCellNum();
			for(int j=0;j<colno;j++) {
				XSSFCell cell=row.getCell(j);
				
				System.out.println("data => "+cell.getStringCellValue());
				
			}		
			
			
		}
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				workbook.close();
				workbook=null;
				fis.close();
				fis=null;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
