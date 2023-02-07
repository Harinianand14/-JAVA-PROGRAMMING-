import java.util.Scanner;
public class findmaxndmin
{
public static void main(int[] num)
{
int max = num[0];
int min = num[0];
for (int i = 1; i < num.length; i++)
{
if (num [i] > max) {
max = num[i];
}
else if (num[i] < min) {
min = num[i];
}
}
System.out.println("The minimum array element is " + min);
System.out.println("The maximum array element is " + max);
}
int[] num = { 5, 7, 2, 4, 9, 6 };
findmaxndmin in(number);
}
