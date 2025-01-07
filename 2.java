//simple calculator

import java.util.Scanner;
public class Switch {
 public static void main(String args[])
 {
 float a,b;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter any two integers : ");
 a = s.nextFloat();
 b = s.nextFloat();
 int op;
 System.out.println("1.add\n2.sub\nEnter your choice");
 op = s.nextInt();
 switch(op)
 {
 case 1: System.out.println(a+b);
 break;
 case 2: System.out.println(a-b);
 break;
 default : System.out.println("Wrong Choice");
 break;
 }
 s.close();
 }
}
