//ecursion

import java.util.Scanner;
public class Recursion {
 public static void main(String args[]) {
 Scanner s = new Scanner(System.in);
 System.out.print("Enter any integer: ");
 int a = s.nextInt();
 System.out.println("Factorial of " + a + " is: " + fact(a));
 s.close();
 }
 public static int fact(int x) {
 if (x == 1) {
 return 1;
 }
 return x * fact(x - 1);
 }
}
