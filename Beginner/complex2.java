

public class complex2 {
   public static void main(String[] args) {
      sum(1,2,3,4);
   }

   public static void sum(int x1,int x2, int y1,int y2){
      int c1 = x1 + y1; //real
      int c2 = x2 + y2; //img
      System.out.println("sum is : "+ c1 + " + "+ c2 + "i");
   }
}
