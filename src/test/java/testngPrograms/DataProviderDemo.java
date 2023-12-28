package testngPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	public  WebDriver driver;
	
@BeforeClass
public void setUp() {
	WebDriverManager.chromedriver().setup();

	ChromeOptions options=new ChromeOptions();
	options.addArguments("-remote-allow-Origins=*");
	
    driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
}


@Test(dataProvider="login")
public void getdata(String un,String pass) throws InterruptedException{
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
Thread.sleep(1000);	
}

@DataProvider(name="login")
public String[][] providedata() {
	String data[][]= {  {"admin","admin123"},
			          {"admin","admin24"}
			          };
	return data;
}

@AfterClass
public void afterclass() {
driver.close();
}
}
