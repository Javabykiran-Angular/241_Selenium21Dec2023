package com.tka.main;

import com.tka.Config.Config;

public class DemoGmail extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoGmail obj=new DemoGmail();
		obj.browserSetting("https://www.google.com/");
		obj.gmailTrayAccess();
		

	}

}
