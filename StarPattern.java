import java.util.Scanner;
public class StarPattern {
int n;
void accept()
{
Scanner sc =new Scanner(System.in);
System.out.println("\nEnter the Number of Lines: ");
n=sc.nextInt();
}
void pattern()
{
int i,j;
for(i=1; i<=n; i++)
{
for(j=1; j<=1; j++)
System.out.print("* ");
System.out.println();
}
}
public static void main(String [] args)
{
StarPattern p=new StarPattern();
p.accept();
p.pattern();
}
}