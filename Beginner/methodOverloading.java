package Beginner;

public class methodOverloading {
   public static void main(String[] args) {
      System.out.println(rectangle(8));
      System.out.println(rectangle(2,5));      
   }

   public static int rectangle(int x) {
      int area = x * x;
      System.out.print("Area of the rectangle is : ");
      return area;
   }
   public static int rectangle(int x, int y) {
      int area = x * y;
      System.out.print("Area of the rectangle is : ");
      return area;
   }
}
