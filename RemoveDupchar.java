import java.util.Arrays;   
public class RemoveDupchar   
{   
static void RemoveDupchar(String str)   
{   
int index1 = 1;          
int index2 = 1;  
char arr[] = str.toCharArray();   
while (index1 != arr.length)   
{   
if(arr[index1] != arr[index1-1])   
{   
arr[index2] = arr[index1];   
index2++;   
}   
index1++;   
}   
str = new String(arr);  
System.out.println(str.substring(0, index2));   
}   
static String sortString(String str)   
{   
char temp[] = str.toCharArray();   
Arrays.sort(temp);   
         
       str = new String(temp);   
           
       return str;   
    }   
           
    public static void main(String[] args)   
    {   
        String str = " Programming in Java in Internet Applications ";   
        String newString = sortString(str);  
        System.out.println(newString);   
        RemoveDupchar(newString);  
    }   
}  