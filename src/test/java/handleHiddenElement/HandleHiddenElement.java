package handleHiddenElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenElement {
public static WebDriver driver;
public static void main(String args[]) {	
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.letskodeit.com/practice");
    driver.manage().window().maximize();
 
   // Approach 1:
    driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
   
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.getElementById('displayed-text').value='Selenium';");
//in above st we will use id of element inside the getElementById()

    String s = (String) js.executeScript("return document.getElementById('displayed-text').value");
	  System.out.print("Value entered in hidden field: " +s);
	      driver.close();
}}

//


//How To Inspect Hidden / Disappeared Elements In Just One Click:by naveen automation labs
//Approach 2:by using selectors hub :when we open selectors hub then there is option turn on debugger in right side 
//verticle menu (where selectors hub generated  xpath are there )we click on that option so it will freez the website then i will
//inspect the ele which i want and after that i release the debugger( there is option pause the debugger so there play symbol is
// there we need to click on that for releaseing)