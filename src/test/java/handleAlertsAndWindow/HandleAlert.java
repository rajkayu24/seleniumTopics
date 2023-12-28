package handleAlertsAndWindow;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Approach 1:f we use implicit wait then write below st
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Approach2:if we use explicit wait then write below st
		//here declaration  of explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//clicking on Alert option
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        //if we are using explicit wait then use below st
        //capture alert into var and get the text from alert and click on ok button  
       Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
       System.out.println(alert.getText());
       alert.accept();

     
       
       /* if we are using  implicit wait then  we write simple steps here
       Alert alertwindow = driver.switchTo().alert();
         String alertText = alertwindow.getText();
         
        //if we want to verify text on alert and based on that we want to click on ok button
         if(alertText=="Click for JS Alert") {
          Thread.sleep(1000);
        	 alertwindow.accept();
             }
              else {
        	 alertwindow.dismiss();
             }
         
         */

}
}