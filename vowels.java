Write a program to print the number of vowels in the given statement?
Sample Input:
Saveetha School of Engineering
Sample Output:
Number of vowels = 12 
Test cases:
1. India is my country
2. All are my brothers and sisters
3. Why dry sky
4. Shy Try Cry
5. EDUCATION
Solution:
import java.util.Scanner;
public class CountingVowels {
public static void main(String args[]){
 int count = 0;
 System.out.println("Enter a sentence :");
 Scanner sc = new Scanner(System.in);
 String sentence = sc.nextLine();
 for (int i=0 ; i<sentence.length(); i++){
 char ch = sentence.charAt(i);
 if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
 count ++;
 }
 }
 System.out.println("Number of vowels in the given sentence is "+count);
 }
}
