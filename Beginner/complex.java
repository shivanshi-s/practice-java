

public class complex {
   double real, img;
	
   //constructor to initialize the complex number
   complex(double r, double i){
	   real = r;
	   img = i;
   }
	
   public static complex sum(complex c1, complex c2)
   {
        complex temp = new complex(0,0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
   }
   
   public static void main(String args[]) {
      complex c1 = new complex(3.2, 4);
      complex c2 = new complex(1.2, 3.2);
      complex temp = sum(c1, c2);
      System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
   }
}
