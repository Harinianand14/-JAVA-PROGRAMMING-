import java.util.Arrays;
import java.util.Scanner;

class Anagram {

    public static void main(String[] args) {
        System.out.println("ENTER ANY TWO STRINGS : ");
        Scanner scanner = new Scanner(System.in);
        String sentence1 = scanner.nextLine();//Getting input sentence 1
        String sentence2 = scanner.nextLine();//Getting input sentence 2

        if (sentence1.replaceAll(" ", "").length() == sentence1.replaceAll(" ", "").length()) {
            char[] characterArray1 = sentence1.toLowerCase().toCharArray(); 
            char[] characterArray2 = sentence2.toLowerCase().toCharArray();

            Arrays.sort(characterArray1);
            Arrays.sort(characterArray2);

            if (Arrays.equals(characterArray1, characterArray2)) {
                System.out.println("The input strings are Anagram");
            } else {
                System.out.println("The input strings are not Anagram");
            }

        } else {
            System.out.println("The input strings are not Anagram");
        }
    }
}