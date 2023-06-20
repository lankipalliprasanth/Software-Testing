Java string codes
   
1. Write a program to reverse a word using loop? (Not to use inbuilt functions)
Sample Input: 
String: TEMPLE
Sample Output:
Reverse String: ELPMET
Test cases:
1. SIGN UP
2. AT-LEAST
3. 1245
4. !@#$%
5. 145*999=144855
Program:
import java.util.Scanner;
public class reverse {
 public static void main(String[] args){
 String str;
 char ch;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a string : ");
 str=sc.nextLine();
 System.out.println("Reverse of a String '"+str+"' is :");
 for(int j=str.length();j>0;--j) {
 System.out.print(str.charAt(j-1));}
 }
}
