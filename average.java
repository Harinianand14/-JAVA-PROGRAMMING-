import java.util.Scanner;
public class average
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  int num, positiveCount = 0, negativeCount = 0;
  double positiveSum = 0, negativeSum = 0;
  System.out.println("Enter numbers: ");
  num = scan.nextInt();
  while (num != -1) 
  {
   if (num > 0) 
   {
    positiveCount++;
    positiveSum += num;
   } 
   else if (num < 0) 
   {
    negativeCount++;
    negativeSum += num;
   }
   num = scan.nextInt();
  }
  if (positiveCount > 0)
  {
   System.out.println("Average of positive numbers: " + positiveSum / positiveCount);
  } 
  else
  {
   System.out.println("No positive numbers entered.");
  }
  if (negativeCount > 0)
  {
   System.out.println("Average of negative numbers: " + negativeSum / negativeCount);
  } 
  else
  {
   System.out.println("No negative numbers entered.");
  }
 }
}