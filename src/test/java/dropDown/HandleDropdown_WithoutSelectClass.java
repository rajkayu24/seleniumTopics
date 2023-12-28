package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//this type of dropdown called Bootstrape dropdown
public class HandleDropdown_WithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		 
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		//click on dropdown button
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//capturing all the options from the dropdown
		List<WebElement> drpoptions = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
		
		for(WebElement optn:drpoptions) {
			
			String text = optn.getText();
			if(text.equals("Java")|| text.equals("Python")){
				optn.click();
			}
			
		}

	}

}
