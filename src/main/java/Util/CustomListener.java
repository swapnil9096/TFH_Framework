package Util;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import BasePage.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class CustomListener extends BasePage implements ITestListener,ISuiteListener{

	ExtentTest test;
	
	ExtentReports extent = ExtentReporterNG.getReportObject();//Getting the object of extent Report
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("OnTestStart method executed : " + result.getMethod().getMethodName());
		test =extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case Failed : " + result.getName());
		test.fail(result.getThrowable());
		
		//screenshot and attach a report
		try {
			driver = (AndroidDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String filePath = getScreenshot(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped method executed : " + result.getMethod());
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		onTestFailure(result);
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test Start....!!");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Finish..");
		extent.flush();
		
	}
	
}
