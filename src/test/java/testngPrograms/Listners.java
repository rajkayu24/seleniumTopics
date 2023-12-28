package testngPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("this is from listeners class:"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("this is from listeners class:"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("testis starting:"+context.getName());
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
								