Write a program to check the entered user name is valid or not. Get both the 
inputs from the user.
Sample Input:
Enter the user name: Saveetha@789
Reenter the user name: Saveetha@123
 
Sample Output
 User name is Invalid
Program:
import java.util.Scanner;
class user_Name{
 public static void main(String [] args){
 Scanner in=new Scanner(System.in);
 System.out.println("enter the user name");
 String str1=in.nextLine();
 System.out.println("Reenter the user name");
 String str2=in.nextLine();
 if(str1.equals(str2)){
 System.out.println("User name is valid");}
 else{
 System.out.println("User name is not valid");}
 }
}
