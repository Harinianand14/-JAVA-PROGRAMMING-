import java.util.Scanner;
class Vote {
public static void main(String[] args)
{
int age;
Scanner scan = new Scanner(System.in);
System.out.println("ENTER THE PERSON'S AGE:");
age = scan.nextInt();
if(age>=18)
{
System.out.println("Eligible for voting");
}
else
{
System.out.println("Not Eligible for Voting");
}
}
}

