package com.tha.wait;

import com.tha.config.Config;

public class DemoWait extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoWait obj=new DemoWait();
		obj.browserSetting("https://jbktest.com/");
		obj.wait_iframe();

	}

}
