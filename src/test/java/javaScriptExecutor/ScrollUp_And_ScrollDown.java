package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUp_And_ScrollDown {
  public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
				
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//scroll donw the page by pixel
		 //js.executeScript("window.scrollBy(0,1000)","");
		 
		//scroll down the page till find ele
		 WebElement ele = driver.findElement(By.xpath("//p//a[text()='OpenCart']"));
		 //js.executeScript("arguments[0].scrollIntoView();", ele);
	
		
		 //scroll down the page till bottom
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		 Thread.sleep(2000);
		
		 //scroll UP the page or go back to initial position
		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		 
		 //click on ele /radio btn/checkbox
		 js.executeScript("argument[0].click();",ele);
	}

}
