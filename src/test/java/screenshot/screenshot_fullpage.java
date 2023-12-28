package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot_fullpage {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
	options.addArguments("-remote-allow-Origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		
		/*
		TakesScreenshot sc=(TakesScreenshot)driver;
		
		File src = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File( System.getProperty("user.dir") +"\\Screenshots\\"+"fullscreenshot.png"));
		*/

		/*	//screenshot of ele 
		
WebElement ele = driver.findElement(By.xpath("//img[@title='Your Store']"));
		File src1 = ele.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src1, new File(System.getProperty("user.dir")+"\\Screenshots\\"+"\\elescreenshot.png\\"));	
	
	*/
	
	
		//screenshot of portion or section of page  of page
		
		WebElement section = driver.findElement(By.xpath("//div[@class='col'][2]"));
	
	File src2=section.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src2,new File(System.getProperty("user.dir")+"\\Screenshots\\"+"\\sectionimg.png"));
	}

}
