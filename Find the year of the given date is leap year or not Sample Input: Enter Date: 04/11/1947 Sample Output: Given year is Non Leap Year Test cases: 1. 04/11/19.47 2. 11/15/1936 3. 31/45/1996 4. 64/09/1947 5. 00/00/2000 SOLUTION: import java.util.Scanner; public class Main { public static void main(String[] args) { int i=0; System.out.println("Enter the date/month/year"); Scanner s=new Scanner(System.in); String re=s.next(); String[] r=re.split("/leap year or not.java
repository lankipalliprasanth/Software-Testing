Find the year of the given date is leap year or not
Sample Input:
Enter Date: 04/11/1947
Sample Output:
Given year is Non Leap Year
Test cases:
1. 04/11/19.47
2. 11/15/1936
3. 31/45/1996
4. 64/09/1947
5. 00/00/2000
SOLUTION:
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int i=0;
System.out.println("Enter the date/month/year");
Scanner s=new Scanner(System.in);
String re=s.next();
String[] r=re.split("/",3);
int x=Integer.parseInt(r[2]);
if(x%4==0)
{
System.out.println("It is an leap year");
}
else{
System.out.println("It is not a leap year:");
}
}
}
