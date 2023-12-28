package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("admin");
		driver.findElement(By.name("lastname")).sendKeys("admin");
		
		WebElement popup = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ezmob-footer-close']")));
	popup.click();
		driver.findElement(By.id("sex-1")).click();
		
		driver.findElement(By.id("exp-3")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("24-09-2023");
		
		driver.findElement(By.id("profession-1")).click();
		

		driver.findElement(By.id("tool-2")).click();
		
		WebElement continents = driver.findElement(By.id("continents"));
		Select se=new Select(continents);
		se.selectByVisibleText("Asia");
		
		
		WebElement waitcommands = driver.findElement(By.id("selenium_commands"));
		Select se1 =new Select(waitcommands);
		se1.selectByVisibleText("Wait Commands");
		
		driver.findElement(By.id("photo")).click();
		
		
}
}