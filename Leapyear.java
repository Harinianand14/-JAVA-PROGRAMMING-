import java.util.Scanner;
class Leapyear
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE YEAR : ");
        int year = sc.nextInt();

        if((year%400==0) || ((year%4==0) && (year%100!=0))){
            System.out.println(year+" IS A LEAP YEAR ! ");
        }
        else {
            System.out.println(year+" IS NON-LEAP YEAR ! ");
        }
    }
}
