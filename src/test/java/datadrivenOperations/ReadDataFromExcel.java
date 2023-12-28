package datadrivenOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadDataFromExcel {

public static  WebDriver driver; 
//excelfile>workbook>sheet>row>cell
public static FileInputStream fi;
public static XSSFWorkbook wb;
public static XSSFSheet s;
public static XSSFRow r;
public static XSSFCell c;

public static void main(String args[]) throws IOException {

	File file=new File(System.getProperty("user.dir")+"\\testdata\\readData.xlsx");//1)give the location of file
	
	fi=new FileInputStream(file);//2)open file in fileinput mode 
	
wb=new XSSFWorkbook(fi);//3)open workbook

s=wb.getSheet("Sheet1");//4)open sheet

int totalrow=s.getLastRowNum();//5)total row 
int totalcell=s.getRow(1).getLastCellNum();// and total col

System.out.println("Number of rows:"+totalrow);
System.out.println("Number of cols:"+totalcell);

for(int r=0;r<=totalrow;r++) //6)read row  and 
{//excel row 1 se start krta h isliye total row 4 show kr raha h(jabki row  5 h header ko mila kr) 
	//and col 0 se start kr raha h isliye col 2  show kr raha h(jabki col 2 hi h ) 
	XSSFRow currentrow = s.getRow(r);
	for(int c=0;c<totalcell;c++)//col 0 se start hota h 
	 {
		String data=currentrow.getCell(c).toString();
		System.out.print(data+"  ");
	}
	System.out.println();
}


wb.close();
fi.close();

}

}
