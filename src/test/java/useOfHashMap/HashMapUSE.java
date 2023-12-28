package useOfHashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to use java hashmap in selenium?

public class HashMapUSE {

	public static void main(String[] args) {

/*
//Scenario1:-storing the data into hashmap and reading the data from hashmap
HashMap<String,String> map=new HashMap<String,String>();
map.put("username","admin");
map.put("password","admin123");

System.out.println(map);//{password=admin123, username=admin}
System.out.println(map.get("password"));//admin123
*/
	
//Scenario2:-
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Admin","adminusnm:passadmin1");
		map.put("Customer","custUsename:cutpassadmin2");
		map.put("HR","hrusername:hrpassadmin3");
		
		System.out.println(map);//{Customer=custUsename:cutpassadmin2, HR=hrusername:hrpassadmin3, Admin=adminusnm:passadmin1}
		
		System.out.println(map.get("Admin"));//adminusnm:passadmin1
		//now i need to split un and pass from(:)

		 String ar1[]=map.get("Admin").split(":");
		 System.out.println(ar1[0]);//adminusnm
		 System.out.println(ar1[1]);//passadmin1
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 driver.findElement(By.id("txtUsername")).sendKeys(ar1[0]);
         driver.findElement(By.id("txtPassword")).sendKeys(ar1[1]);
		
	/*	 
	//similarly we can do for other option (like customer and hr ) also if required	
      System.out.println(map.get("Customer"));//custUsename:cutpassadmin2
     String  ar2[]=map.get("Customer").split(":");
     System.out.println(ar2[0]);//custUsename
	 System.out.println(ar2[1]);//
	 */
	 /*
      System.out.println(map.get("HR"));//hrusername:hrpassadmin3
		*/

	
	}

}
