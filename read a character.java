Write a program to read a character until a * is encountered. Also count the number of 
uppercase, lowercase, and numbers entered by the users.
Sample Input:
Enter * to exit…
Enter any character: W
Enter any character: d
Enter any character: A
Enter any character: G
Enter any character: g
Enter any character: H
Enter any character: *
Sample Output:
Total count of lower case:2
Total count of upper case:4
Total count of numbers =0
Test cases:
1. 1,7,6,9,5
2. S, Q, l, K,7, j, M
3. M, j, L, &, @, G
4. D, K, I, 6, L, *
5. *, K, A, e, 1, 8, %, *
SOLUTION:
import java.util.*;
class upper_lower_num{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
String c=" ";
int c1=0,c2=0,c3=0;
while(c.charAt(0)!='*'){
System.out.println("Enter any character:");
c=a.next();
if(Character.isUpperCase(c.charAt(0))){
c1++;
}
else if(Character.isLowerCase(c.charAt(0))){
c2++;
}
else if(Character.isDigit(c.charAt(0))){
c3++;
}
}
System.out.println("Total number of Upper case="+c1);
System.out.println("Total number of Lower case="+c2);
System.out.println("Total number of Digits="+c3);
}
}
