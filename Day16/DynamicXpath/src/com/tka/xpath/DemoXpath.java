package com.tka.xpath;

import com.tka.dynamicXpath.Config;

public class DemoXpath extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoXpath obj=new DemoXpath();
		obj.browserSetting("https://www.w3schools.com/");
		obj.accessElement();

	}

}
