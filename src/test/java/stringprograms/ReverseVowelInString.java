package stringprograms;
//Reverse vowel in string means if there is i/p-> Hello, o/p -> Holle 
//or if Input : hello world  Output : hollo werld
public class ReverseVowelInString {

// utility function to check for vowel
static boolean isVowel(char c) {

return (c =='a'|| c == 'A' || c == 'e'|| c == 'E' || c == 'i' || c == 'I'|| c == 'o' || c == 'O' || c == 'u'|| c == 'U');
	
}
// Function to reverse order of vowels
static String reverseVowel(String str) {
			// Start two indexes from two corners
			// and move toward each other
			int i = 0;
			int j = str.length()-1;
			char[] str1 = str.toCharArray();
			while (i < j)
			{
				if (!isVowel(str1[i]))//H
				{
					i++;//e
					continue;
				}
				if (!isVowel(str1[j]))//o
				{
					j--;
					continue;
				}

				// swapping
				char t = str1[i];//e so t=e
				str1[i]= str1[j];//o so i=o
				str1[j]= t;//e so j=e
				

				i++;//i value became l
				j--;//j value became l
			}
			String str2 = String.copyValueOf(str1);//Holle
			return str2;//Holle
		}
// Driver function
public static void main(String[] args) {
String str = "hello";
System.out.println(reverseVowel(str));
			
}
		

	}


