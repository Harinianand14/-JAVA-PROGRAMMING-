import java.util.Scanner;
class Conversion {
public static void main(String args[])
{
    Scanner scan;
    int num;
    getVal() ;
     {
          System.out.println("Decimal to HexaDecimal,Octal and Binary");
          scan = new Scanner(System.in);
          System.out.println("\nEnter the number :");
          num = Integer.parseInt(scan.nextLine());
     }
    conversion() ;
      {
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal Value is : " + hexa);
           String octal = Integer.toOctalString(num);
           System.out.println("Octal Value is : " + octal);
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary Value is : " + binary);
       }
}
class Decimal_Conversion
{
{
        Conversion obj = new Conversion();
         obj.getVal();
         obj.conversion();
    }
}
}