package testngPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {

	 public static WebDriver driver;
	 
	 
	 @Parameters("browser")
     @BeforeClass
		 public void setup(String br) {
	 	if(br.equals("chrome")) 
	 	{
	 		WebDriverManager.chromedriver().setup();
	 		ChromeOptions option=new ChromeOptions();
	 		option.addArguments("-remote-allow-Origins=*");
	 		driver=new ChromeDriver(option);
	 	
	 	}else if(br.equals("edge")) 
	 	   {
	 		WebDriverManager.edgedriver().setup();
	 		EdgeOptions option=new EdgeOptions();
	 		option.addArguments("-remote-allow-Origins=*");
	 		driver=new EdgeDriver(option);
	 	  }
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get("https://demo.opencart.com/");
	 	driver.manage().window().maximize();
	 	
	 }	

	 	
	 	@Test
	   public void f() {
	  //driver.close();
	 	}
	 }


