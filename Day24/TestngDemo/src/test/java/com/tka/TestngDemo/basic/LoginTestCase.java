package com.tka.TestngDemo.basic;

import org.testng.annotations.Test;

public class LoginTestCase {
	
	@Test(priority = 1)
	public void usernameTest() {
		System.out.println("U r in usernameTest");
	}
	
	@Test(priority = 2,enabled = false)
	public void passwordTest() {
		System.out.println("U r in passwordTest");
	}

}
