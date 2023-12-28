package file_Upload_Donload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Download {

	public static void main(String[] args) {
	
//download file using Chrome browser******************************		
	   /*	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions  options=new ChromeOptions();
		options.addArguments("-remote-allow-Origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		//download text file**************
		//type text in textbox
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("hi selenium");
		//click on generate button
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		//click on download link
		driver.findElement(By.id("link-to-download")).click();
		*/
		
	
//download file using firefox*********************************************

		//1)first i will create FirefoxProfile class instance and using this ref i will setpreference
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain,Application/pdf");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("pdfjs.disabled",true);//only for pdf

		WebDriverManager.firefoxdriver().setup();
		
//2)second i will create instance of FirefoxOptions   class
		FirefoxOptions  options=new FirefoxOptions();
	//3)third using FirefoxOptions  ref i will set profile by using setProfile() option
		options.addArguments("-remote-allow-Origins=*");
		options.setProfile(profile);
		//4)fourth i will pass option class ref as a argument in FirefoxDriver()
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		
		
	
		
		//type text in textbox
				driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("hi selenium");
				//click on generate button
				driver.findElement(By.xpath("//button[@id='createTxt']")).click();
				//click on download link
				driver.findElement(By.id("link-to-download")).click();
				
				
		
		
	}

}
