package actions_Class_Operations;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Refreah_page {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
				
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
	
	   Actions actions = new Actions(driver);
	   actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	}
}

