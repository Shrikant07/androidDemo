package com.cucumber.stepDefinition;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.page.objects.Choose_org_screen;
import com.cucumber.page.objects.Emergency_contact_details_screen;
import com.cucumber.page.objects.FindDoctor;
import com.cucumber.page.objects.FindUs;
import com.cucumber.page.objects.News;
import com.cucumber.page.objects.Options_screen;
import com.cucumber.page.objects.SignUp_screen;
import com.cucumber.prerequisites.InitialSetUp;
import com.cucumber.utilities.FunctionLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestSteps {
	
	
	static String propFile = "config.properties";
    static Properties propertyFile = FunctionLibrary.getPropertyFile(propFile);
	
	public static AndroidDriver<AndroidElement> wd;
	
	@Given("^Application is installed$")
	public void app_is_installed() throws Throwable {
		
		InitialSetUp.beforeMethod();

	}
	
	@Given("^I sign out$")
	public void i_sign_out() throws Throwable {
		
		InitialSetUp.afterTest();

	}
	
	@When("^I choose an orgnisation$")
	public void i_choose_an_orgnisation() throws Throwable {
		
		Choose_org_screen.choose_1_option(wd).click();
		Thread.sleep(5000);
	}

	@Then("^I should navigate to sign up screen$")
	public void i_should_navigate_to_sign_up_screen() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(wd, 60);
		WebElement skip_option = wait.until(ExpectedConditions.visibilityOf(SignUp_screen.skip_option(wd)));
	}

	@Then("^I click on SKIP option$")
	public void i_click_on_SKIP_option() throws Throwable {
		
		SignUp_screen.skip_option(wd).click();
		Thread.sleep(3000);
	}

	@Then("^I should navigate to city hospital options screen$")
	public void i_should_navigate_to_options_screen() throws Throwable {
	
		Boolean emergency_call= Options_screen.emergency_call(wd).isDisplayed();
		
		if(emergency_call== true) {
			
			System.out.println("Navigate properly to option screen");
			
		} else {
			
			System.err.println("Option screen loadin issue");
			Assert.fail("Option screen loadin issue");
		}
		
	}

	@When("^I select call emergency option$")
	public void i_select_call_emergency_option() throws Throwable {
		
		Options_screen.emergency_call(wd).click();
	}

	@Then("^I should see emergency contact number$")
	public void i_should_see_emergency_contact_number() throws Throwable {
		
		Boolean emergency_call= Emergency_contact_details_screen.emergency_call(wd).isDisplayed();
		
		if(emergency_call== true) {
			
			System.out.println("Emergency contact number displayed properly in contact details");
			
		} else {
			
			System.err.println("Emergency contact number not displayed in contact details");
			
			Assert.fail("Emergency contact number not displayed in contact details");
		}
	}

	@Then("^I should see switchboard number$")
	public void i_should_see_switchboard_number() throws Throwable {
		
		Boolean switchBoard= Emergency_contact_details_screen.switchBoard(wd).isDisplayed();
		
		if(switchBoard== true) {
			
			System.out.println("Switch Board number displayed properly.");
			
		} else {
			
			System.err.println("Switch Board number not displayed.");
			
			Assert.fail("Switch Board number not displayed.");
		}
	}

	@Then("^I should see call center contact number$")
	public void i_should_see_call_center_contact_number() throws Throwable {

		Boolean callCenter= Emergency_contact_details_screen.callCenter(wd).isDisplayed();
		
		if(callCenter== true) {
			
			System.out.println("CallCenter number displayed properly.");
			
		} else {
			
			System.err.println("CallCenter number not displayed.");
			
			Assert.fail("CallCenter number not displayed.");
		}
	}
	
	@When("^I select find us option$")
	public void i_select_find_us_option() throws Throwable {
		
		Options_screen.find_us(wd).click();
		Thread.sleep(2000);
	}

	@Then("^I should see contact number$")
	public void i_should_see_contact_number() throws Throwable {
		
		Boolean contactNo= FindUs.contactNo(wd).isDisplayed();
		
		if(contactNo== true) {
			
			System.out.println("Contact number displayed properly.");
			
		} else {
			
			System.err.println("Contact number not displayed.");
			
			Assert.fail("Contact number not displayed.");
		}
		
	}

	@Then("^I should see address$")
	public void i_should_see_address() throws Throwable {
		
		
		
		Boolean address= FindUs.address(wd).isDisplayed();
		
		if(address== true) {
			
			System.out.println("Address displayed properly.");
			
		} else {
			
			System.err.println("Address not displayed.");
			
			Assert.fail("Address not displayed.");
		}
		
	}

	@Then("^I should see call button$")
	public void i_should_see_call_button() throws Throwable {

		
		Boolean callButton= FindUs.callButton(wd).isDisplayed();
		
		if(callButton== true) {
			
			System.out.println("Call button displayed properly.");
			
		} else {
			
			System.err.println("Call button not displayed.");
			
			Assert.fail("Call button not displayed.");
		}
		
	}
	
	@When("^I select gallery option$")
	public void i_select_gallery_option() throws Throwable {
		
		Options_screen.gallery(wd).click();
		Thread.sleep(1000);
	}
	
	
	@When("^I select find doctor option$")
	public void i_select_find_doctor_option() throws Throwable {

		Options_screen.find_doctor(wd).click();
	}

	@Then("^I should navigate to find doctor screen$")
	public void i_should_navigate_to_find_doctor_screen() throws Throwable {
		
		Boolean searchField= FindDoctor.searchField(wd).isDisplayed();
		
		if(searchField== true) {
			
			System.out.println("Navigated to find doctor screen properly.");
			
		} else {
			
			System.err.println("Navigation issue to find doctor screen.");
			
			Assert.fail("Navigation issue to find doctor screen.");
		}
		
	}

	@Then("^I enter doctor name$")
	public void i_enter_doctor_name() throws Throwable {
		
		FindDoctor.searchField(wd).sendKeys("Shah");
	}

	@Then("^I select a doctor name$")
	public void i_select_a_doctor_name() throws Throwable {
		
		FindDoctor.searched_doctorName(wd).click();
		
//		TouchAction touch = new TouchAction(InitialSetUp.wd);
//		touch.tap(341, 268).perform();
//		Thread.sleep(1000);
		
	}

	@Then("^I should see searched doctor info$")
	public void i_should_see_searched_doctor_info() throws Throwable {
		
		Boolean searchResult= FindDoctor.searchResult(wd).isDisplayed();
		
		if(searchResult== true) {
			
			System.out.println("Searched doctor info displayed properly. \n=============");
			
		} else {
			
			System.err.println("Searched doctor info not displayed properly.");
			
			Assert.fail("Searched doctor info not displayed properly.");
		}
		
	}
	
	@When("^I select news option$")
	public void i_select_news_option() throws Throwable {

		Options_screen.news(wd).click();
	}
	
	@Then("^I should navigate to news screen$")
	public void i_should_navigate_to_news_screen() throws Throwable {
		
		
		
		Boolean newsPage= News.newsPage(wd).isDisplayed();
		
		if(newsPage== true) {
			
			System.out.println("Navigated to news screen properly.");
			
		} else {
			
			System.err.println("Navigation issue to news screen.");
			
			Assert.fail("Navigation issue to news screen.");
		}
		
	}


}
