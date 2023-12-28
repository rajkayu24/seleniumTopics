package takescrrnshotOfFailedTC;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testcases extends Base {
@BeforeMethod
public void setup() {
	launchbrowser();
}

@AfterMethod
public void teardown() {
	driver.quit();
	}

@Test
public void screenshotTest4() {
	Assert.assertEquals(false, true);	
}
}
