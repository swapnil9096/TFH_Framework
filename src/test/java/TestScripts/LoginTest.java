package TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.HomePage;
import Pages.LaunchApp;

public class LoginTest extends BasePage{

	LaunchApp launch;
	HomePage home;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		InitializeDriver();
		launch = new LaunchApp();
		home = new HomePage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(description="Verify login functionality")
	public void verifyLogin() throws InterruptedException
	{
		
		launch.getLogin();
		String actualResult = home.getProfileName();
		
		Assert.assertEquals(actualResult, "Hello, Mommy!","Test Case Failed...!!!");
	}
}
