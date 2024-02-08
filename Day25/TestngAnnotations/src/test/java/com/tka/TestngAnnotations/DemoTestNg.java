package com.tka.TestngAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNg {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("----------U r in beforeSuit Method--------------- ");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("================== u r in beforeTest method================");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("++++++++++++++++++ u r in beforeClass method +++++++++++++++");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("*************** u r in beforeMethod ******************");
	}
	
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("--------------- U r in test1------------");
	}
	

	@Test(priority = 2)
	public void test2() {
		System.out.println("--------------- U r in test2------------");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("*************** u r in afterMethod ******************");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("++++++++++++++++++ u r in afterClass method +++++++++++++++");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("================== u r in afterTest method================");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("----------U r in afterSuit Method--------------- ");
	}
	
	
	

}
