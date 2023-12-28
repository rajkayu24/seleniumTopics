import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Different_ways_of_Perform_click {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
				
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
	

		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		//driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//a[text()='Login']")).click();
		
		//using Actions class***************************
		 Actions actions = new Actions(driver);  
		    actions.click(myAccount).perform();//performing click on myaccount tab
	
		    Thread.sleep(1000);
		  //using sendkeys method of action class 
		    WebElement login = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//a[text()='Login']"));
		    actions.sendKeys(login, Keys.RETURN).perform();
	
		    Thread.sleep(1000);
		   
		    //Using JavaSript Executor******************************
		    
		     WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Login']"));
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();",loginbtn);//performing click on loginbtn 
	
	
	}

}
