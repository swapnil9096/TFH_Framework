package Pages;

import org.openqa.selenium.By;

import BasePage.BasePage;
import io.appium.java_client.AppiumBy;

public class LaunchApp extends BasePage {

	SignInPage sign = new SignInPage();
			
	
	public LaunchApp()
	{
		super();
	}
	
	By language  	= AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView");
	
	By nextlngBtn   = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]");
	
	By subBtn 	= AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup"); 
	
	By signInGoogle = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]");
									  
	By addAc = AppiumBy.id("com.google.android.gms:id/add_account_chip_title");
	
	By dontAllowLoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
	
	By noneAbove = AppiumBy.id("com.google.android.gms:id/cancel");
	
	public void clickOnlan() throws InterruptedException
	{
		driver.findElement(language).click();
		util.sleep();
	}
	
	public void clickOnNextBtn() throws InterruptedException
	{
		driver.findElement(nextlngBtn).click();
		util.sleep();
	}
	
	
	public void clickOnSubmitBtn() throws InterruptedException
	{
		driver.findElement(subBtn).click();
		util.sleep();
	}
	
	public void clickOnNoneOfAboveLink() throws InterruptedException
	{
		try {
		driver.findElement(noneAbove).click();
		}catch(Exception e)
		{
			//ignore
		}
	}
	
	public void clickOnSignInWithGoogle() throws InterruptedException
	{
		driver.findElement(signInGoogle).click();
		util.sleep();
	}
	
	public SignInPage clickOnAddAnotherAccount() throws InterruptedException
	{
		driver.findElement(addAc).click();
		util.sleep();
		
		return new SignInPage();
		
	}
	
	public void clickOnDontAllowBtn() throws InterruptedException
	{
		util.explicitWait(dontAllowLoc);
		driver.findElement(dontAllowLoc).click();
		util.sleep();
	}
	
	
	public HomePage getLogin(String name) throws InterruptedException
	{
		clickOnlan();
		clickOnNextBtn();
		clickOnSubmitBtn();
		clickOnNoneOfAboveLink();
		clickOnSignInWithGoogle();
		clickOnAddAnotherAccount();
		
		sign.enterEmail();
		sign.clickOnEmailNextBtn();
		sign.enterPass();
		sign.clickOnPassNextBtn();
		sign.clickOnAgreeBtn();
		clickOnDontAllowBtn();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
}
