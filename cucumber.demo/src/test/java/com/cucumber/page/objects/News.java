package com.cucumber.page.objects;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class News {
	
	public static AndroidElement element = null;

	public static AndroidElement newsPage(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/WebView_HTML");
		return element;
	}

}
