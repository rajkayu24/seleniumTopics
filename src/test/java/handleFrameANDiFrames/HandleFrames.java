package handleFrameANDiFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		
		//clicking on frame option
		driver.findElement(By.linkText("Nested Frames")).click();
				
			//first we chek that how many frames on the page so for this in developer toool we type cntrl+f 
		//and inside the serach box will type //frame
		//so this will give u no. of frames on the page
		//by using tagname locator and size() 
		// so here we found there is 2 child frame of parent frame i.e first frame name
		//frame-top and second frame name bottom-frame and frame having name frame-top is also have 3 different 
		//child frame 1.frame-left 2.frame-middle 3.2.frame-right 
		
		//NOTE:without going to parent frame we can not directly switch to one child 
		//frame to anather child frame
			
		driver.switchTo().frame("frame-top");//we are directly switch on this frame
			//will check how many frames inside the frame-top by below st-
		System.out.println(driver.findElements(By.tagName("frame")).size());//3//it will give no of child frame inside frame-top framei.e3
				
			driver.switchTo().frame("frame-left");//this is 1st child
			driver.switchTo().parentFrame();//again we need to go back to parent framebefore switch to anather child frame
		   
			driver.switchTo().frame("frame-middle");//this is 2 nd child 
		   driver.switchTo().parentFrame();//go bach to parent frame
		   
		 driver.switchTo().frame("frame-right");//this is 3 rd child 
		 driver.switchTo().defaultContent();//go back to top most frame not parent frame i.e main frame
		 
		System.out.println( driver.findElements(By.tagName("frame")).size());//after going to top ost parent frame 
		//we will check how many child is there it gives 2 frame-top and frame-bottom
		driver.switchTo().frame("frame-bottom");//we are switchin to frame-bottom
	  	driver.switchTo().parentFrame();////going to parent frame 
		
		 
		   
		   
		   
		   
		   
		   
		   
		   
				
			    
			    //driver.switchTo().defaultContent();
				
				
				
				
				
				
				
				
				//frame-top
				//frame-bottom
				//frame-left
				//frame-middle
				
	}

}
