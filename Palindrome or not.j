 Write a program using choice to check
Case 1: Given string is palindrome or not
Case 2: Given number is palindrome or not
Sample Input:
Case = 1
String = MADAM
Sample Output:
Palindrome
Test cases:
1. MONEY
2. 5678765
3. MALAY12321ALAM
4. MALAYALAM
5. 1234.4321
Program:
Case-1
import java.util.Scanner;
class palindromeString {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 String str = in.nextLine(), reverseStr = "";
 int strLength = str.length();
 for (int i = (strLength - 1); i >=0; --i) {
 reverseStr = reverseStr + str.charAt(i);}
 if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
 System.out.println(str + " is a Palindrome String.");}
 else {
 System.out.println(str + " is not a Palindrome String.");}
 }
}
Case-2 
import java.util.Scanner;
public class palindrome {
 public static void main(String args[]) {
 Scanner in = new Scanner(System.in);
 int r, sum = 0, temp;
 int n = in.nextInt();
 temp = n;
 while (n > 0) {
 r = n % 10;
 n = n / 10;
sum = (sum * 10)+r;
 }
 if(temp==sum)
 System.out.println(sum+" is palindrome number");
 else
 System.out.println(sum+" is not palindrome number");
 }
}
