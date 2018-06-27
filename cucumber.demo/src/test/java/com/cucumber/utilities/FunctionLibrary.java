package com.cucumber.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.cucumber.prerequisites.InitialSetUp;

public class FunctionLibrary {

	
	//Function to Create random numbers
	
	public static String valid_randomnum()
	
	{
		Random rand = new Random();
		
		String phone_no = "1";
		for(int i = 1;i<10;i++ )
		{
			phone_no = phone_no + Integer.toString(rand.nextInt(10));
			
		}
		
		return  phone_no ;
	}
	
	public static String random_roll_num() {
	
		int Length = 3;
		return RandomStringUtils.randomNumeric(Length);
	
}
	
	public static  String student_name() {
		
		int stringLength = 5;
		
		String studName=RandomStringUtils.randomAlphabetic(stringLength);
		
		String start="Student"+studName;
		
		return start;
		
	}
	
	public static  String parent_name() {
		
		int stringLength = 5;
		
		String studName=RandomStringUtils.randomAlphabetic(stringLength);
		
		String start="Parent"+studName;
		
		return start;
		
	}
	
	public static  String student_name2() {
		
		int stringLength = 4;
		
		String studName=RandomStringUtils.randomAlphabetic(stringLength);
		
		return studName;
		
	}
	
	public static String less_than_10_randomnum()
	
	{
		Random rand = new Random();
		
		String phone_no = "1";
		for(int i = 1;i<8;i++ )
		{
			phone_no = phone_no + Integer.toString(rand.nextInt(8));
			
		}
		
		return  phone_no ;
	}
	

// Function to create a random characters
	
public static  String ten_randomchar() {
	
	int stringLength = 10;
	
	return RandomStringUtils.randomAlphabetic(stringLength);
	
}

public static  String Teach_shareGrp_randomchar() {
	
	int stringLength = 5;
	
	String grpName=RandomStringUtils.randomAlphabetic(stringLength);
	
	String end="TeachShareGrp"+grpName;
	
	return end;
	
}

public static  String Teach_transGrp_randomchar() {
	
	int stringLength = 5;
	
	String grpName=RandomStringUtils.randomAlphabetic(stringLength);
	
	String start="TeachtransGrp"+grpName;
	
	return start;
	
}

public static  String TeachGrp_randomchar() {
	
	int stringLength = 5;
	
	String grpName=RandomStringUtils.randomAlphabetic(stringLength);
	
	String start="TeachGrp"+grpName;
	
	return start;
	
}

public static  String AdminShareGrp_randomchar() {
	
	int stringLength = 5;
	
	String grpName=RandomStringUtils.randomAlphabetic(stringLength);
	
	String start="AdminSharGrp"+grpName;
	
	return start;
	
}

public static  String AdminTransGrp_randomchar() {
	
	int stringLength = 5;
	
	String grpName=RandomStringUtils.randomAlphabetic(stringLength);
	
	String start="AdminTransGrp"+grpName;
	
	return start;
	
}


public static  String more_than_20randomchar() {
	
	int stringLength = 21;
	
	return RandomStringUtils.randomAlphabetic(stringLength);
	
}

public static Properties getPropertyFile(String propFile){
	Properties properties = new Properties();
//	String propFile = "config.properties";
	InputStream resourceAsStream = InitialSetUp.class.getClassLoader().getResourceAsStream(propFile);
	
	if(resourceAsStream!=null){
		try {
			properties.load(resourceAsStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	return properties;
}


public static String randomEmail() {
	
	int stringLength = 5;
    return RandomStringUtils.randomAlphabetic(stringLength) + "@example.com";
}



}
