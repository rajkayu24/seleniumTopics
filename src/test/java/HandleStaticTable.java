import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleStaticTable {

	public WebDriver driver;
@Test
public void setup() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("-remote-allow-Origins=*");
	driver=new ChromeDriver(options);
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	driver.manage().window().maximize();
}

@Test
public void handletable() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@id='ezmob-footer-close']")).click();
	int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
Thread.sleep(3000);
	System.out.println("the no. of rows in table are:"+rows);
}
	
}
