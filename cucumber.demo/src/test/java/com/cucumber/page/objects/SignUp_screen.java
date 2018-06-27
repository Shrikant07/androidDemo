package com.cucumber.page.objects;

import org.openqa.selenium.By;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SignUp_screen {

	public static AndroidElement element = null;

	public static AndroidElement skip_option(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElement(By.id("com.hospitalcare:id/MyTextView_Regular_Skip"));
		return element;
	}
	
	public static AndroidElement add_first_child(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElement(By.id("com.pebstone.teno:id/addChildEditText1"));
		return element;
	}

	public static AndroidElement add_second_child(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElement(By.id("com.pebstone.teno:id/addChildEditText2"));
		return element;
	}
}