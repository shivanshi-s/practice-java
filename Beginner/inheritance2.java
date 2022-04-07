package Beginner;
import java.util.*;
class Bank
{
    Scanner s=new Scanner(System.in);
    String name;
    String acctype;
    int accno;
    void getdata()
    {
        System.out.println("enter name");
        name=s.next();
        System.out.println("enter acctype");
        acctype=s.next();
        System.out.println("enter account no");
        accno=s.nextInt();
    }
    void putdata()
    {
        System.out.println("name is::"+name);
        System.out.println("acctype is::"+acctype);
        System.out.println("accno is::"+accno);
    }
}
class Current extends Bank
{
    int balance;
    void deposit1()
    {
        
        System.out.println("enter balance");
        balance=s.nextInt();
        
        
            int deposit;
            System.out.println("enter deposit");
            deposit=s.nextInt();
            balance=balance+deposit;
    }
    void withdraw()
    {
        int withdraw_amt;
        System.out.println("enter withdraw_amt");
        withdraw_amt=s.nextInt();
        balance=balance-withdraw_amt;
        if(withdraw_amt>balance)
        {
            balance=balance+withdraw_amt;
            System.out.println("You can withdraw");
        }
        else
        {
            System.out.println("you cannot withdraw");
        }
    }
    
}
class Saving extends Bank 
{
    void deposit1()
    {
        int balance;
        System.out.println("enter balance");
        balance=s.nextInt();
    }
    
    void deposit2()
    {
        int deposit_amt,savings;
        System.out.println("enter deposit amt");
        deposit_amt=s.nextInt();
        System.out.println("enter savings");
        savings=s.nextInt();
        savings=savings+deposit_amt;
        
    }
    void withdraw1()
    {
        int withdraw_amt1,saving1;
        System.out.println("enter withdraw_amt");
        withdraw_amt1=s.nextInt();
        System.out.println("enter saving");
        saving1=s.nextInt();
        saving1=saving1-withdraw_amt1;
        if(withdraw_amt1>saving1)
        {
            saving1=saving1+withdraw_amt1;
            System.out.println("you can withdraw");
        }
        else
        {
            System.out.println("you cannot withdraw");
        }
    }
}
public class inheritance2 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Current cr=new Current();
        cr.getdata();
        cr.putdata();
        cr.deposit1();
        cr.withdraw();
        Saving sr=new Saving();
        sr.getdata();
        sr.putdata();
        sr.deposit2();
        sr.withdraw1();
        int ch;
        System.out.println("enter ur choice");
        ch=s.nextInt();
        System.out.println("Enter 1 for current acc details");
        System.out.println("Enter 2 for saving acc details");
        switch(ch)
        {
            case 1:
                    int choice;
                    System.out.println("1.withdraw");
                    System.out.println("2.deposite");
                    System.out.println("enter the choice");
                    choice=s.nextInt();
                    switch(choice)
                    {
                        case 1:
                                cr.withdraw();
                                break;
                        case 2:
                                cr.deposit1();
                                break;
                        default:
                                System.out.println("wrong choice");
                                break;
                    }
                break;
            case 2:
                    int choice1;
                    System.out.println("1.withdraw1");
                    System.out.println("2.deposite2");
                    System.out.println("enter the choice");
                    choice1=s.nextInt();
                    switch(choice1)
                    {
                        case 1:
                                sr.withdraw1();
                                break;
                        case 2:
                                sr.deposit2();
                                break;
                        default:
                                System.out.println("wrong choice");
                                break;
                    }
 
                break;
            default:
                System.out.println("u entered wrong choice");
        }
    }
}