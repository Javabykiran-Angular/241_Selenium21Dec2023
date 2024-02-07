package com.tka.TestngDemo.signup;

import org.testng.annotations.Test;

public class Signup {
	
	@Test(priority = 1)
	public void signupTest1() {
		System.out.println("u r in signupTest1 Execute-----");
	}
	
	@Test(priority = 2)
	public void signupTest2() {
		System.out.println("u r in signupTest2 Execute-----");
	}
	

}
