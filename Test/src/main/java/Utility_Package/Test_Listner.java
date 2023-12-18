package Utility_Package;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listner implements ITestListener{
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Method Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Method Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Method Failed: " + result.getName());
	        WebDriver driver = null;
	        SceenShot.takeScreenshot(driver, result.getName()); // Corrected the class name
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Method Skipped: " + result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Not implemented
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("Test Suite Started: " + context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test Suite Finished: " + context.getName());
	    }

	

}
