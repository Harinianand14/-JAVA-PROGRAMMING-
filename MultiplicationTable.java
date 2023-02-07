import java.util.Scanner;
public class MultiplicationTable {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);
System.out.print("ENTER A NUMBER: ");
int num = in.nextInt();
for (int i=0; i< 10; i++)
{
System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
}
}
}