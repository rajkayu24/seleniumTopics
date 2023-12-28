package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownSimple {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.id("multiselect1"));
     
	//handle multi selection dropdown
	 Select se1=new Select(drp);
	  boolean b = se1.isMultiple();
	  System.out.println("Boolen value for drodown: "+ b);//true 
	
	   se1.selectByValue("volvox");//selecting Volvo
	   se1.selectByValue("Hyundaix");//selecting Hyndai
	   se1.deselectByValue("volvox");//deselect this option
	  //se1.deselectByVisibleText("text");//or 2 nd  way of deselect
	   //se1.deselectByIndex("index");//or 3 rd way of deselect
	   //if i want to deselect all option than 
	   //se1.deselectAll();
	   
	   
	   //handle single dropdown
	  
	   WebElement dropelement = driver.findElement(By.id("drop1"));
	  	Select se2=new Select(dropelement);
        boolean b1=se2.isMultiple();
	 System.out.println("Boolean value for dropdown:"+b1);//false
	 se2.selectByValue("ghi");
	 
	
	  List<WebElement> options1=se2.getOptions();
	   
	   for(WebElement option:options1) {
		   System.out.println(option.getText());
		   
	   }
	

	}


}