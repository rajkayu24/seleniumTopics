package linksAndBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinksAndBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total links present on webpage:"+links.size());

		//frist we check href attribute value of link , if the href att is null or empty that means 
		//we can not check it is broken or normal link but if href att has some value 
		//then only we can findout it is broken or normal link
		
		int brokenlinks=0;
		for(WebElement linkEle:links){
		String hrefAttValue = linkEle.getAttribute("href");
			
		if(hrefAttValue==null ||hrefAttValue.isEmpty()) {
			System.out.println("href attribute value is empty");
			continue;
		}
		//and if it is not empty then we will convert this hrefAttValue i.e targetlink into url format because this is in  string
		//format  so in this format we can send req to server,before open the conn anf=d send req to server we need to convert it into url format
		
		URL linkUrl=new URL(hrefAttValue);//convert==>String to url format URL class comes from java.net pkg
		
		//send req to server this include 2 steps 
		//1==>open conn. 
		//2==>connect
	
		HttpURLConnection conn=(HttpURLConnection)linkUrl.openConnection();//here we r opening conection
		//HttpURLConnection class come from java.net method 
		conn.connect();//send req to server
		
		//and now checking response from server
		//if response is greater than 400 that means we are not get
		//proper response from the server so that is broken links
		and if the response is <=400 that means we got proper response from server 
		//so that is not a broken links
		
		if(conn.getResponseCode()>=400) {
			System.out.println(hrefAttValue+"     "+"====>Broken Link");
		brokenlinks++;
		}
		else
		{
			System.out.println(hrefAttValue+"     "+"====> Not Broken Link");
			
		}
	   }
		
		System.out.println("total no of  Broken Links:"+brokenlinks);
			
	}

}
