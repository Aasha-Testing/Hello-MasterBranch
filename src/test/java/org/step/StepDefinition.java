package org.step;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	 
	@Given("User will launch the browser")
	public void userWillLaunchTheBrowser() {
	    System.out.println("Browser Launch BG");
	}

	@When("User will enter the Username and Password in the respective field")
	public void user_will_enter_the_Username_and_Password_in_the_respective_field() {
	    System.out.println("Enter values");
	}

	@When("User will click the login button")
	public void user_will_click_the_login_button() {
	  System.out.println("Click Button");
	 
	}

	@Then("User is verifying the login functionality")
	public void user_is_verifying_the_login_functionality() {
	   System.out.println("Verified facebook");
	}
	
	@Then("User is verifying the fb functionality")
	public void user_is_verifying_the_fb_functionality() {
		System.out.println("Verified facebook 11");
	}

	@Then("User is verifying the fb functionality with sysout")
	public void user_is_verifying_the_fb_functionality_with_sysout() {
		System.out.println("Verified facebook 1");
	}
	@When("User will enter the UserId and Password in the respective field")
	public void userWillEnterTheUserIdAndPasswordInTheRespectiveField() {
		System.out.println("Verified facebook 1");
	}

	@Then("User is verifying the fb functionality  sysout")
	public void userIsVerifyingTheFbFunctionalitySysout() {
		System.out.println("Verified facebook 1");
	}
	
	
	

	@When("User will enter the UserId and Password in the respective Fields")
	public void userWillEnterTheUserIdAndPasswordInTheRespectiveFields() {
	   System.out.println("Enter values for Instgram");
	   browserLaunch();
	   driver.get("https://www.facebook.com/");
	}

	@When("User will click the login btn")
	public void userWillClickTheLoginBtn() {
	    System.out.println("Click Btn for Instagram");
	    driver.findElement(By.name("email")).sendKeys("Selenium");
	   
	    driver.findElement(By.name("pass")).sendKeys("Selenium@12345");
	}

	@Then("User is verifying the ins functionality")
	public void userIsVerifyingTheInsFunctionality() {
	   System.out.println("Verify Login function for instagram");
	}

	@Then("User is verifying the ins functionality  sysout")
	public void userIsVerifyingTheInsFunctionalitySysout() {
		System.out.println("Verify Login function for instagram 2");
	}
	


}
