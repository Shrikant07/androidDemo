package com.cucumber.page.objects;

import org.openqa.selenium.By;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Choose_org_screen {
	
	public static AndroidElement element = null;
	
	//page object for add first child
	public static AndroidElement choose_1_option(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/ImageView_OrgImage");
		return element;
	}

}
