package com.tka.TestngDemo.basic;

import org.testng.annotations.Test;

public class DemoTestng {
	
	@Test(priority = 1,description = "This test 1 execute")
	public void test1() {
		System.out.println("---U r in Test1-----");
	}
	
	@Test(priority = 2)
	public void atest2() {
		System.out.println("---U r in atest2-----");
	}

}
