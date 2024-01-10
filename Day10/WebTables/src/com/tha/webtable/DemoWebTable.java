package com.tha.webtable;

import com.tha.config.Config;

public class DemoWebTable extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoWebTable obj=new DemoWebTable();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/users.html");
		
		obj.userTable();
		
		

	}

}
