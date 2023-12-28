package takescrrnshotOfFailedTC;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listner extends Base implements ITestListener {



@Override
	  public void onTestStart(ITestResult result) {
	 System.out.println("started "  +result.getName());
	 
	  }

@Override 
	  public  void onTestSuccess(ITestResult result) {

	  }

@Override
	  public void onTestFailure(ITestResult result) {
	 System.out.println("Test is failed");
	  captureScreenshot(result.getMethod().getMethodName());
	  }



@Override
	  public void onTestSkipped(ITestResult result) {
	 System.out.println(result.getName());
	  }
@Override
	  public  void onFinish(ITestContext context) {
	 System.out.println(context.getName());
	}
}
	

