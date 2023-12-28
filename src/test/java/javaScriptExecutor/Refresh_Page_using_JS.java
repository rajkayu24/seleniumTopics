package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh_Page_using_JS {
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("-remote-allow-Origins=*");
	WebDriver driver=new ChromeDriver(options);
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.opencart.com/");
	
	
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("history.go(0)");//refresh page
}
}