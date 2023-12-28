package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_DropOR_AutosuggestDrop {

public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> totaloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[contains(@class,'wM6W7d')]//span"));
		
		
		for(WebElement option:totaloptions) {
			String text = option.getText();
			if(text.equals("selenium")) {
				option.click();
			}
		}
		
	}

}
