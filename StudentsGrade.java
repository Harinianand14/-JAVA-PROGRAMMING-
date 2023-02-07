import java.util.Scanner;
public class StudentsGrade {
public static void main(String[] args) {
int count, i;
float totalMarks = 0, percentage, average;
Scanner scanner;
scanner = new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF SUBJECTS: ");
count = scanner.nextInt();
System.out.println("ENTER THE MARKS OF  " + count + " SUBJECT");
for (i = 0; i < count; i++) {
totalMarks += scanner.nextInt();
}
System.out.println("TOTAL MARKS : " + totalMarks);
percentage = (totalMarks / (count * 100)) * 100;
switch ((int) percentage / 10) {
case 9:
System.out.println("GRADE : A+");
break;
case 8:
case 7:
System.out.println("GRADE : A");
break;
case 6:
System.out.println("GRADE : B");
break;
case 5:
System.out.println("GRADE : C");
break;
default:
System.out.println("GRADE : D");
break;
case 4:
System.out.println("GRADE : E");
break;
}
}
}