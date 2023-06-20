Write a program to arrange the letters of the word alphabetically in reverse order
Sample Input:
Enter the word: MOSQUE
Sample Output:
Alphabetical Order: U S Q O M E
Test Case:
1. HYPOTHECATION
2. MATRICULATION
3. MANIPULATION
4. SATISFACTION
5. DEDICATION
import java.util.*;
class alpha_sort{
 public static void main(String[] args){
Scanner a=new Scanner(System.in);
 String str=a.nextLine();
 int n=str.length();
 char temp;
 char arr[]=str.toCharArray();
 for(int i=0;i<n;i++){
 for(int j=0;j<n;j++){
 if(arr[i]>arr[j]){
 temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
 }
 }
 }
 a.close();
 String str1=new String(arr);
 System.out.println(str1);
 }
}
