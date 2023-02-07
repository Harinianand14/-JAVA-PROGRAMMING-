import java.util.Scanner;
public class VowndCon 
{
public static void main(String [] args)
{
int i; 
Scanner sc = new Scanner(System.in);
System.out.println("ENTER A WORD: ");
String s=sc.nextLine();
for (i=0;i<=s.length()-1; i++)
{
char ch=s.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println(ch + "is Vowel");
}
else
{
System.out.println(ch + "is Consonant");
}
}
}
}