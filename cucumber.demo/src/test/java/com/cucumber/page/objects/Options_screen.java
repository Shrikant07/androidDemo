package com.cucumber.page.objects;

import org.openqa.selenium.By;

import com.cucumber.prerequisites.InitialSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Options_screen {
	
	public static AndroidElement element = null;

	public static AndroidElement emergency_call(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Call_Emergency");
		return element;
	}
	
	public static AndroidElement find_us(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Find_us");
		return element;
		
	}
	
	public static AndroidElement find_doctor(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Find_Doctor");
		return element;
		
	}
	
	public static AndroidElement gallery(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Gallery");
		return element;
		
	}
	
	public static AndroidElement book_appointment(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_Book_Appointment");
		return element;
		
	}
	
	public static AndroidElement news(AndroidDriver wd)
	{
		element = (AndroidElement) InitialSetUp.wd.findElementById("com.hospitalcare:id/LinearLayout_News");
		return element;
		
	}
	
	
}
