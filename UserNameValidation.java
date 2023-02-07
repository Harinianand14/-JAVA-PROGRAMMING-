import java.util.Scanner;
public class UserNameValidation
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter A Username:");
  String s1=sc.nextLine();
  System.out.println("ReEnter A Username:");
  String s2=sc.nextLine();
  {
   if(s1.equals(s2))
   {
    System.out.println("Valid");
   }
   else
    System.out.println("Invalid");
  }
 }
} 
