import java.util.Scanner;

public class CountSplChr {
	private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		sc= new Scanner(System.in);
		System.out.print("\nENTER ANY ALPHA NUMERIC STRING: =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNUMBER OF ALPHABET CHARACTERS  =  " + alph);
		System.out.println("NUMBER OF DIGIT CHARACTERS    =  " + digi);
		System.out.println("NUMBER OF SPECIAL CHARACTERS   =  " + spl);
	}
}
