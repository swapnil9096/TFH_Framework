package BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Util.Utilities;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {

	public Properties prop;
	public static AndroidDriver driver;
	public static Utilities util;
	public BasePage()
	{
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error in file path...!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error in Loading the file...!!");
		}
	}
	
	
	public void InitializeDriver() throws InterruptedException
	{
		try {
			util = new Utilities();
			
			URL url = new URL("http://127.0.0.1:4723/");
		
			//Initialize driver
			driver = new AndroidDriver(url,util.setDesiredCapabilities());
			
		} catch (MalformedURLException e) 
		{
			e.printStackTrace();
			System.out.println("Error in URL...!!");
		}
		
		//Using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
	public String getScreenshot(String testCaseName) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String file =System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\" + testCaseName + ".png";

		try {
			FileUtils.copyFile(source, new File(file));
		} catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("Error in copying file...!!");
		}

		return file; 
	}
	}
