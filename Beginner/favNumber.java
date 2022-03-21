package Beginner;

import java.util.Scanner;

public class favNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("enter your favourite integer: ");
      int favouriteNumber =  input.nextInt();

      System.out.println(favouriteNumber + " is my favourite integer too!");
      
   }
}
