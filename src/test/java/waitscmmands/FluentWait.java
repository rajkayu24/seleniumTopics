package waitscmmands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		//below is declaration of Fluent  wait
	
		 Wait<WebDriver> wait = new FluentWait()
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);

		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		//below is usage of Explicit wait
		 WebElement email =(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
		
		email.sendKeys("khushi24@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("admin24");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		driver.manage().window().maximize();
		
	}

	private org.openqa.selenium.support.ui.FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	