package com.tka.config;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
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
	
	

}
