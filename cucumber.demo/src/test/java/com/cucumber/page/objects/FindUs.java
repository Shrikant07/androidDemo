package com.cucumber.page.objects;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FindUs {
	
	public static AndroidElement element = null;

	public static AndroidElement contactNo(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementByAndroidUIAutomator("new UiSelector().text(\"Contact No:\")");
		return element;
	}
	
	public static AndroidElement address(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementByAndroidUIAutomator("new UiSelector().text(\"Address:\")");
		return element;
	}
	
	public static AndroidElement callButton(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Call");
		return element;
	}

}
