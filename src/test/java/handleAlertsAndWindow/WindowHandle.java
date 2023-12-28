package handleAlertsAndWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		//we are converting Set collection to List because Set does not have any method for retriving  data  
		List<String> windowidlist=new ArrayList<String>(windowIDs);
		
		String parantWindowID = windowidlist.get(0);
		String childWindowID = windowidlist.get(1);
		
	//switching to child window
	String ctitle = driver.switchTo().window(childWindowID).getTitle();
	System.out.println("child browser title is:"+ctitle);
	driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	
//switching to parent window
	String ptitle = driver.switchTo().window(parantWindowID).getTitle();
	System.out.println("parant browser title is:"+ptitle);
	
	
	}

}
