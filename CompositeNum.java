import java.util.Scanner;
public class CompositeNum
{
   public static void main(String[] args) 
   {
      System.out.println("ENTER ANY NUMBER :");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0; 
      for(int i = 1; i <= n; i++) {
         if (n % i == 0)
            count++;
      }
      if (count >3)
         System.out.println("YES, IT IS A COMPOSITE NUMBER !!");
      else
         System.out.println("NO, IT IS NOT A COMPOSITE NUMBER !!");
   }
}