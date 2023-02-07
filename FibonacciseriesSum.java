import java.util.Scanner;
public class FibonacciseriesSum {
   public static void main(String[] args){
      int my_input, j, sum;
      my_input = 17;
      System.out.println("The value of N: ");
      int fabonacci[] = new int[2 * my_input + 1];
      fabonacci[0] = 0;
      fabonacci[1] = 1;
      sum = 0;
      for (j = 2; j <= 2 * my_input; j++) {
          fabonacci[j] = fabonacci[j - 1] + fabonacci[j - 2];
          if (j % 2 == 0)
            sum += fabonacci[j];
      }
      System.out.printf("The even sum of fibonacci series till number %d is %d" , my_input, sum);
   }
}