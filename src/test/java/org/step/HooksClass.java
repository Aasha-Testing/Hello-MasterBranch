package org.step;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	
	@Before (order=1 , value="@Sanity")
	public void browserLaunching() {
		System.out.println("BrowserLaunch from hooks - 1");

	}
	
	@Before (order=10)
	public void implicitWait() {
		System.out.println("Wait time from hooks -10");

	}
	@Before (order = 12)
	public void ScreenShot() {
		System.out.println("SS before in hooks -12");

	}
	
	
	@After (order=1, value="@Sanity")
	public void quitBrowser() {
	System.out.println("Quit Browser from hooks -1");

	}
	@After (order=5)
	public void clearCookies() {
		System.out.println("Clear Catche from hooks -5");

	}
	@After (order=10)
	public void screenShot(Scenario s) {
		System.out.println("SS after in hooks -10");
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			
			s.embed(screenshotAs, "image/png");
			
			
			
			
			
			
			
		}

	}

}
