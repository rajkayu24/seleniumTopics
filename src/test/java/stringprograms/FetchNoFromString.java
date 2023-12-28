package stringprograms;

public class FetchNoFromString {

	public static void main(String[] args) {
		String s="B12ar356ni";
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				System.out.print(ch+"  ");//12356
			
			}
		}

		
	}

}
