package com.cucumber.prerequisites;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cucumber.utilities.FunctionLibrary;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class InitialSetUp {

	
	public static AndroidDriver<AndroidElement> wd;
	
	static String propFile = "config.properties";
    static Properties propertyFile = FunctionLibrary.getPropertyFile(propFile);
	
	public static void beforeMethod() throws MalformedURLException {

	try {
		
			
			File classpathRoot = new File(System.getProperty("user.dir"));
	     	File appDir = new File(classpathRoot, "/app");
     	
			DesiredCapabilities capabilities = new DesiredCapabilities();
			File app = new File(appDir, propertyFile.getProperty("appName"));
	     	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	        capabilities.setCapability("deviceName", propertyFile.get("device_name"));
	        capabilities.setCapability("platformVersion", "4.4.2");
	     	capabilities.setCapability("platformName", "Android");
	     	capabilities.setCapability("appPackage", "com.hospitalcare");
	     	capabilities.setCapability("appActivity", "com.hospitalcare.Splash_Screen");
			
		
	     	capabilities.setCapability("app", app.getAbsolutePath());

	     	wd = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

	     	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	     	System.out.println("Appium server started successfully.\n==================");
		
		
		}catch(Exception e){
		
		e.printStackTrace();
		System.out.println("Appium server launch issue.\n==================");
		
		}

	}
	


	public static void afterTest() {
			
			try{
				
				Thread.sleep(3000);
				wd.quit();			
				Thread.sleep(1000);
				
			 }catch(Exception e) {
				
				e.printStackTrace();
			}
	
			
	}
	
}

