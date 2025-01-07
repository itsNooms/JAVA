// addition of numbers

import java.util.Scanner;
public class sum1 {
 public static void main(String[] args)
 {
 Scanner s = new Scanner(System.in);
 int x = s.nextInt();
 float y = s.nextFloat();
 System.out.println(sum(x,y));
 s.close();
 }
 public static float sum(int a,float b)
 {
 float sum =a+b;
 return sum;
 }
}
Out
