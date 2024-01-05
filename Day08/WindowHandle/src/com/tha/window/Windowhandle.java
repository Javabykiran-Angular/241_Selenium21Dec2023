package com.tha.window;

import com.tha.config.Config;

public class Windowhandle extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Windowhandle obj=new Windowhandle();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.login();
		obj.dashboard();

	}

}
