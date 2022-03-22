package Beginner;

import java.util.Scanner;

public class calc {
   public static void main(String[] args) {
      System.out.println("Enter the number, operator and number (5 * 7 ) : ");

      Scanner s = new Scanner(System.in);
      double d1 = s.nextDouble();
      char op = s.next().charAt(0);
      double d2 = s.nextDouble();

      if(op == '+')
         System.out.println((int)(d1+d2));
      else if(op == '-')
         System.out.println((int)(d1-d2));
      else if(op == '/')
         System.out.println((int)(d1 / d2));
      else if(op == '*')
         System.out.println((int)(d1 * d2));
      else
         System.out.println("Invalid Operator!");
   }
}
