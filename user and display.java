Write a program that accepts a string from user and displays the same string after removing 
vowels from it.
Sample Input & Output:
Enter a string: we can play the game 
The string without vowels is: w cn ply thgm
import java.util.*;
class remov_vowels{
 public static void main(String[] args){
 Scanner a=new Scanner(System.in);
 String str=new String();
 String str1=new String();
 str1="";
 str=a.nextLine();
 a.close();
for(int i=0;i<str.length();i++){
 
if(Character.toLowerCase(str.charAt(i))=='a'||Character.toLowerCase(str.charAt(i))=='e'||Ch
aracter.toLowerCase(str.charAt(i))=='i'||Character.toLowerCase(str.charAt(i))=='o'||Charact
er.toLowerCase(str.charAt(i))=='u'){
 
 }else{
 str1=str1+str.charAt(i);
 }
 }
 System.out.println(str1);
 }
}
