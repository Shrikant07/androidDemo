package com.cucumber.page.objects;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FindDoctor {
	
	public static AndroidElement element = null;

	public static AndroidElement searchField(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/AutoCompleteTextView_Search");
		return element;
	}
	
	public static AndroidElement searched_doctorName(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementByClassName("android.widget.LinearLayout");
		return element;
	}
	
	
	public static AndroidElement searchResult(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementByAndroidUIAutomator("new UiSelector().text(\"DR. SHAH\")");
		return element;
	}
	
	
	
}
