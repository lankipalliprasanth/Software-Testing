Write a program to convert Decimal number equivalent to Binary number 
and octal numbers?
Sample Input:
Decimal Number: 15
Sample Output:
Binary Number = 1111
Octal = 17
Test cases:
1. 111
2. 15.2
3. 1010.011
4. B12
5. 1A.2
Program:
import java.util.Scanner;
class conversion {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 // decimal number
 int decimal = in.nextInt();
 // convert decimal to binary
 String binary = Integer.toBinaryString(decimal);
 System.out.println("BINARY IS " + binary);
 //convert decimal to octal
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(decimal));
 }
}
