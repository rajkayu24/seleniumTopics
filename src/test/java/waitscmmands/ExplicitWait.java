package waitscmmands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		//below is declaration of Explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(2));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		//below is usage of Explicit wait
		WebElement email = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
		
		email.sendKeys("khushi24@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("admin24");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		driver.manage().window().maximize();
		
	}

}
