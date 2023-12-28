package testngPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;


public class DataproviderSimple {
	//public static  WebDriver driver;
	
  @Test(dataProvider="dp")
  public void logindata(String un,String pass) {
  System.out.println(un);
  System.out.println(pass);
  }
  
  @DataProvider(name="dp")
  public String[][] logindataprovider(){
	  String data[][]= {{"admin1","admin1"},{"admin2","admin2"}};
	  return data;
  }
  
 

}
