package com.tha.mainclass;

import com.tha.config.Config;

public class ModifyCode extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ModifyCode obj=new ModifyCode();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.login();

	}

}
