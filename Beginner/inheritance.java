package Beginner;

public class inheritance {
   public static void main(String[] args) {
      // create customer 1
      Bank cust1 = new Bank(); //object for the bank class
      cust1.deposit(500);
      // create customer 2
      Bank cust2  = new Bank(); 
      cust2.deposit(1000);
      // object for bank
      System.out.println("Balance for Customer 1 :");
      System.out.println(cust1.getBalance());
      System.out.println("Balance for Customer 2 : ");
      System.out.println(cust2.getBalance());

      // withdrawal
      cust1.withdraw(200);
      cust2.withdraw(1500);
   }
}
class Bank {
   double balance;
   public void account() {
      balance = 0.0;
   }
   // deposit
   public void deposit(double amount){
      balance = balance + amount;
   }
   // withdraw
   public void withdraw(double amount){
      if (amount <= balance){
         balance = balance - amount;
      }
      else {
         System.out.println("Transaction error due to insufficient balance");
      }
      
   }
   // get balance
   public double getBalance(){
      return balance;
   }
}
