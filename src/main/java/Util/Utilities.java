package Util;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.BasePage;
import io.appium.java_client.remote.MobileCapabilityType;

public class Utilities extends BasePage{

	public DesiredCapabilities setDesiredCapabilities()
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));
		
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\src\\main\\resources\\Apps\\base.apk");
		
//		dc.setCapability("appPackage", "com.avegen.together");
//		
//		dc.setCapability("appActivity", "com.avegen.together.MainActivity");
//		
//		dc.setCapability("appWaitPackage", "com.avegen.together");
		
		return dc;
	}
	
		public void explicitWait(By wait)
		{
			WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(prop.getProperty("explicittimeout"))));
			explicitWait.until(ExpectedConditions.presenceOfElementLocated(wait));
		}


		public void sleep() throws InterruptedException
		{
			Random random = new Random();
			int a =random.nextInt(1100,1500);
			int b =random.nextInt(1500,1600);
			
			Thread.sleep(a+b);
			
		}












}