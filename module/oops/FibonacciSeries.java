package module.oops;

import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number:");
       int a = s.nextInt();
       int b=0, c=1;
       System.out.println("Series:"+b+" "+c);
       for(int i=2; i<a; i++)
       {
            int next = b + c;
            System.out.println(next+" ");
            b=c;
            c=next;
       }

    }
}
