package handleAlertsAndWindow;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithOkCanceliInputBox {
public static void main(String args[]){
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();

	/*
	 //alert with ok cancel=======================================================
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	//swith to alert
	Alert alert=driver.switchTo().alert();
    System.out.println(alert.getText());
     alert.dismiss(); 
    */
    
    //Alert with input box i.e prompt========================================================
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
    Alert alertwindow = driver.switchTo().alert();
   alertwindow.sendKeys("welcome");
   
   alertwindow.accept();   //validation
   String resultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
   System.out.println(resultText);
  
   
   String exptext="You entered: welcome";
   if(resultText.equals(exptext)) {
	   System.out.println("test passed");
   }else {
	   System.out.println("test failed");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    
}
}
