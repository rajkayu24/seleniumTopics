package javaScriptExecutor;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Type_Text_using_JS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
				
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
	 
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//a[text()='Login']")).click();
		
		
	
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement username = driver.findElement(By.name("email"));
		username.clear();
		js.executeScript("arguments[0].value='kayu@gmail.com'" ,username);//here arguments[0] we took for 1 orgumrnt i.e username
		
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.clear();
	
		js.executeScript("arguments[0].value='rajsheetal24'",pass);
			
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
