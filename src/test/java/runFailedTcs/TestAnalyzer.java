package runFailedTcs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestAnalyzer implements IRetryAnalyzer{
int count=0;
int retryLimit=4;

	
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<retryLimit) {
			
			System.out.println("Retrying ===="+result.getName());
		count++;
		return true;
		}
		return false;
	}
	

}


