
import java.util.Scanner;

public class StrPalindrome {
static boolean stringPalindrome(int i, String s){
    if(i>=s.length()/2){
        return true;
    }
    // like in other numbers how we use the n here in the string we use the s.length() -> which refers to n
    // and s.charAt(index) is a method that returns the character at the specified position (index) in the string s.
    /*String s = "Hello";
char ch = s.charAt(1); // ch will be 'e' because index 1 is the second character
System.out.println(ch); // Output: e
*/ 
    if(s.charAt(i) != s.charAt(s.length()-i-1))
        return false;
     
         
    return palindrome(i+1, s);
    
}    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string to check if palindrome : ");
    String s = sc.next();
    // String s = "madama";
    System.out.println(stringPalindrome(0, s));
}
}
