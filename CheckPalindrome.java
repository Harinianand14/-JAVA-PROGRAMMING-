import java.util.Scanner; 
class CheckPalindrome {
public static void main (String [] args)
{
String str, rev = " ";
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE STRING: ");
str = sc.nextLine();
int length = str.length();
for (int i = length - 1; i >=0; i-- )
rev = rev + str.charAt(i);
if (str.equals(rev))
System.out.println(str+" IS A PALINDROME");
else
System.out.println(str+" IS NOT A PALINDROME");
}
}