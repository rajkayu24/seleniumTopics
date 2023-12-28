package takescrrnshotOfFailedTC;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base{

public static WebDriver driver;

	
public static void launchbrowser() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();

}

public void captureScreenshot(String testMethodName) {
	
	String timeStamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());//generate time stamp
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenshots\\"+ testMethodName + "_" + timeStamp + ".png"));
	
} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}





}