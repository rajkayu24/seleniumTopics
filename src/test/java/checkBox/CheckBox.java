package checkBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm#checkbox");
		driver.manage().window().maximize();
	
	List<WebElement> totalCheckbox = driver.findElements(By.xpath("//input[@type='checkbox' and @name='color']"));
	System.out.println(totalCheckbox.size());
	/*for(WebElement checkbox:totalCheckbox) {
		if(checkbox.isSelected()) 
		{ 
			checkbox.click();
	
		}else {
			checkbox.click();
		}
			}
	*/
	
	//select first 2 checkbox
	/*for(int i=0;i<2;i++) {
		totalCheckbox.get(i).click();
	}*/
	for(int i=0;i<totalCheckbox.size();i++) {
		if(i<2) {
			totalCheckbox.get(i).click();
		}
	}
	
	//1st way =>select last 2 checkbox
	
	for(int i=totalCheckbox.size()-2;i<totalCheckbox.size();i++) {
		totalCheckbox.get(i).click();
		
		}
/*	
	//2 nd way of select last 2 checkbox
	for(int i=4;i<totalCheckbox.size();i++) {
		totalCheckbox.get(i).click();
	}
	
	*/
	
	
	
	}
		
}
