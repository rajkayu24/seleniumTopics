package listAllWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonListAllWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   List<WebElement> allWebElements = driver.findElements(By.xpath("//*"));
			System.out.println("list of all the webElement available on the webpage:"+allWebElements.size());
			for(WebElement ele:allWebElements) {
			System.out.println(ele.getText());
			
			}
	}

}
