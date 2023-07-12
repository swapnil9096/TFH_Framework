package Pages;

import org.openqa.selenium.By;

import BasePage.BasePage;
import io.appium.java_client.AppiumBy;

public class HomePage extends BasePage{

	public HomePage()
	{
		super();
	}
	
	By profileName = AppiumBy.className("android.view.View");
	
	public String getProfileName()
	{
		return driver.findElement(profileName).getText();
	}
	
}
