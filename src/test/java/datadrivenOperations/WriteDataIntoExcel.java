package datadrivenOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

public static FileOutputStream  fo;
public static XSSFWorkbook wb;
public static XSSFSheet s;

public static void main(String[] args) throws IOException {
	
File file=new File(System.getProperty("user.dir")+"\\testdata\\datawrite.xlsx");
fo=new FileOutputStream(file);
	
	 wb=new XSSFWorkbook();
	 s=wb.createSheet();
	
	//Approach-1 without loop
	//XSSFRow row1=s.createRow(0);
	
	//row1.createCell(0).setCellValue("abc");//here we r creating different column in 1 st row 
	//row1.createCell(1).setCellValue("xyz");
	
	//XSSFRow row2=s.createRow(1);
	
	//row2.createCell(0).setCellValue("abcde");//here we r creating different column in 2 st row 
		//row2.createCell(1).setCellValue("xyzgf");
	
	//Approch-2 with loop
	Scanner sc=new Scanner(System.in);

for(int r=0;r<=4;r++) 
{
       XSSFRow currentrow=s.createRow(r);
		for(int c=0;c<3;c++) {
			//currentrow.createCell(0).setCellValue("123");//here we r writing same value 
		System.out.println("eneter the value:");//here we will take different value by using Scanner class 
		String value=sc.next();
		currentrow.createCell(c).setCellValue(value);
		
		}
	}
	//here 2 nd Approch finished and from below st common for both Approach 
wb.write(fo);	
wb.close();
fo.close();

System.out.println("writing is done.......");
	} 

}
