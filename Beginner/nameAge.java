package Beginner;

import java.util.Scanner;

public class nameAge {
   public static void main(String[] args) {
      System.out.print("Enter your name and age : ");

      Scanner scanner = new Scanner(System.in);

      System.out.println(scanner.nextLine() + " you are " + 
      scanner.nextInt() + " years old !");
   }
}
