import java.util.Arrays;
public class LargestNumber {
   public static void main(String args[]){
      int array[] = {10, 15, 82, 2, 197, 4, 3};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("SORTED ARRAY ::"+Arrays.toString(array));
      int res = array[size-1];
      System.out.println("THE THE LARGEST ELEMENT IS ::"+res);
   }
}