Given a string s consisting of words and spaces, return the length of the last word in the 
string. A word is a maximal substring consisting of non-space characters only. There 
will be at least one word, consists of only English letters and spaces ' '. 
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Test Case
Test Case Inputs-1
1. Maximal Substring Consisting
2. lea@st one wor2d
3. 1254 98076
4. & * ( ) % # $
5. letters and spaces
import java.util.*;
class last_word{
 public static void main(String[] args){
 Scanner a=new Scanner(System.in);
 String str=a.nextLine();
 String arr[]=str.split(" ");
 System.out.println(arr[arr.length-1]);
 System.out.println(arr[arr.length-1].length());
 }
}
