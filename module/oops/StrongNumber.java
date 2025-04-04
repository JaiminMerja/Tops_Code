package module.oops;

import java.util.Scanner;

public class StrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = s.nextInt();
        int acopy = a;
        int sum = 0;
        while(a!=0)
        {
            int rem= a % 10;
            int fact = 1;
            for(int i=1;i<=rem;i++)
            {
                fact*=i;
            }
            sum+=fact;
            a /= 10;
        }
        if(acopy == sum)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }
    }
}