package file_Upload_Donload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
	options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.foundit.in/");
		
		driver.manage().window().maximize();
		/*
		//using sendkeys()
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Rajendra\\Desktop\\BlazeDemo.txt");
	    */	
		
		//using robot class
		Robot rb=new Robot();
		
		//click on UploadResume button
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Rajendra\\Desktop\\BlazeDemo.txt");
		
		//put the path of file in a clipboard 
		StringSelection ss=new StringSelection("C:\\Users\\Rajendra\\Desktop\\BlazeDemo.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//contrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//press enter
		rb.keyPress((KeyEvent.VK_ENTER));
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
