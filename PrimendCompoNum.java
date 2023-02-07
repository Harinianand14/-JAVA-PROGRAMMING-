import java.util.Scanner;
class PrimendCompoNum {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("ENTER ANY NUMBER: ");
int input_num = sc.nextInt();
int i=2;
while(input_num>0){
if(input_num%i==0)
break;
i++;
}
if(input_num == i)
System.out.println("IT IS A PRIME NUMBER ! ");
else
System.out.println("IT IS A COMPOSITE NUMBER ! ");
}
}