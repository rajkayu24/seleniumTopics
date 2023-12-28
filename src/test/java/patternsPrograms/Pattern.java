package patternsPrograms;
//pattern 7*6
public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=6;j++)
			{
				if(i==2&&j==1)
				{
				System.out.print("S");	
				}
				else if(i==3&&j==2)
				{
				System.out.print("U");	
				}
				else if(i==4&&j==3)
				{
				System.out.print("R");	
				}
				else if(i==5&&j==4)
				{
				System.out.print("Y");	
				}
				else if(i==6&&j==5)
				{
				System.out.print("A");	
				}
				else if(i==7&&j==6)
				{
				System.out.print("-");	
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
/*

output--->

******
S*****
*U****
**R***
***Y**
****A*
*****-
*/