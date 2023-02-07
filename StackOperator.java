import java.util.*;
class StackOperator {
public static void main(String[] args) {
Stack<String> myName=new Stack<String>();  
myName.push("APPLE");  
myName.push ("BERRY");  
myName.push ("CHERRY");  
myName.push ("PINEAPPLE");  
System.out.println("STACK CONTENT :" + myName);
System.out.println("ELEMENT REMOVED : " + myName.pop());
}
}
