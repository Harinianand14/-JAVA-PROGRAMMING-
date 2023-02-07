import java.util.Scanner;
class RemoveVow{
public static void main(String args[]) {
RemoveVow obj = new RemoveVow ();
String str, removedString = "";
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
str = sc.nextLine();
str = str.toLowerCase();
for (int i = 0; i < str.length(); i++) {
if (!obj.isVowel(str.charAt(i))) {
removedString = removedString + str.charAt(i);
}
}
System.out.print("String after removing vowels : ");
System.out.print(removedString);
}
public boolean isVowel(char c) {
String vowels = "aeiou";
for (int i = 0; i < 5; i++) {
if (c == vowels.charAt(i)) {
return true;
}
}
return false;
}
}