package com.cucumber.page.objects;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Emergency_contact_details_screen {
	
	public static AndroidElement element = null;

	public static AndroidElement emergency_call(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Label1");
		return element;
	}
	
	public static AndroidElement switchBoard(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Label2");
		return element;
	}
	
	public static AndroidElement callCenter(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Label3");
		return element;
	}

}
