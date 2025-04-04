package module.exh;

import java.util.Scanner;

class NoBalanceException extends Exception
{
    double amount;
    public NoBalanceException(double amount)
    {
        this.amount=amount;
    }
}
class ATM
{
    double balance;
    public void deposite(double amount)
    {
        balance += amount;
        System.out.println(amount+" ruppes deposite");
    }
    public void withdrawal(double amount) throws NoBalanceException
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println(amount+" ruppes withdrawl successfully");
        }
        else
        {
            double needs = amount - balance;
            throw new NoBalanceException(needs);
        }
    }
}
public class CustomException 
{
    public static void main(String[] args) 
    {
        ATM a = new ATM();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount for deposite:");
        double amount = s.nextDouble();
        a.deposite(amount);
        System.out.println("Enter the amount for withdrawl:");
        amount = s.nextDouble();
        try
        {
            a.withdrawal(amount);
        }
        catch (NoBalanceException e)
        {
            System.out.println("if you entered "+e.amount+" rupees more into your account the you withdrawal "+amount+" ruppes");
        }
    }
}
