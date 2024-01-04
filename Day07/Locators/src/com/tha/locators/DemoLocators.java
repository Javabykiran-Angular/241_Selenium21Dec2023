package com.tha.locators;

import com.tha.config.Config;

public class DemoLocators extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoLocators obj=new DemoLocators();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.locators();
		
	}

}
