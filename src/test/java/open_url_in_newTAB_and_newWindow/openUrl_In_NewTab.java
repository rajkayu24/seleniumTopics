package open_url_in_newTAB_and_newWindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openUrl_In_NewTab {
	
public static WebDriver driver;
	
public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		
	//	driver.switchTo().newWindow(WindowType.TAB);//open url in new tab
		driver.switchTo().newWindow(WindowType.WINDOW);//open url in new window 
		
		driver.get("https://demo.opencart.com/");
	}

}
