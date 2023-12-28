package linksAndBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_LinksAndBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totallinks = links.size();
	System.out.println("total no of links available on webpage:"+totallinks);
	int brokenlinks=0;
	
	for(WebElement link:links) 
	{
		String hrefAttributeValue = link.getAttribute("href");
		if(hrefAttributeValue==null||hrefAttributeValue.isEmpty()) {
			System.out.println("link is not a broken lik not a normal link");
			continue;
		}
	URL linkurl=new URL(hrefAttributeValue);
	HttpURLConnection conn= (HttpURLConnection)linkurl.openConnection();
	conn.connect();
	
	if(conn.getResponseCode()>=400)
	{
		System.out.println(hrefAttributeValue+"  "+"==>is broken link");
		brokenlinks++;
	}else {
		System.out.println(hrefAttributeValue+"  "+"==>not broken link");
	}
	}
	System.out.println("no of broken links are:"+brokenlinks);
	
	}

	
}
