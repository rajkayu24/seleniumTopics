package waitscmmands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("-remote-allow-Origins=*");
	
WebDriver driver=new ChromeDriver(options);

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://tutorialsninja.com/demo/");
driver.manage().window().maximize();

	}

}
