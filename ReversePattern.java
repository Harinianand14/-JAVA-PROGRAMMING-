import java.util.Scanner;
class ReversePattern
{
public static void StarRightTriangle(int n)
{
int a,b;
for(a=n;a<0;a--)
{
for(b=a;b<=a;b--)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[])
{
int n=5;
StarRightTriangle(n);
}
}
