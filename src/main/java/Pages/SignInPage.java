package Pages;

import org.openqa.selenium.By;

import BasePage.BasePage;
import io.appium.java_client.AppiumBy;

public class SignInPage extends BasePage{

	public SignInPage()
	{
		super();
	}
	
	By email = AppiumBy.className("android.widget.EditText");
	
	By emailNextBtn = AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
	
	By password = AppiumBy.className("android.widget.EditText");
	
	By passNextBtn = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
	
	By agreeBtn = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View/android.widget.Button\r\n"
			+ "");
			
	public void enterEmail() throws InterruptedException
	{
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		util.sleep();
	}
	
	public void clickOnEmailNextBtn() throws InterruptedException
	{
		driver.findElement(emailNextBtn).click();
		util.sleep();
	}
	
	public void enterPass() throws InterruptedException
	{
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		util.sleep();
	}
	
	
	public void clickOnPassNextBtn() throws InterruptedException
	{
		driver.findElement(passNextBtn).click();
		util.sleep();
	}
	
	public void clickOnAgreeBtn() throws InterruptedException
	{
		driver.findElement(agreeBtn).click();
		util.sleep();
	}
	
}
