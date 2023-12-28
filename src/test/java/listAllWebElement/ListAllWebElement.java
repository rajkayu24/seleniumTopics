package listAllWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAllWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
				
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
	 //to find liat of all the webElement available on webpage
		List<WebElement> allWebElements = driver.findElements(By.xpath("//*"));
		
		//System.out.println(allWebElements.size());
		System.out.println("list of all the webElement available on the webpage");
		for(WebElement ele:allWebElements) {
		System.out.println(ele.getText());
		
		}
	}}
