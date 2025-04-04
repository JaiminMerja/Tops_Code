package module.oops;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) 
    {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter a number:");
       int a = s.nextInt();
       int fact = 1;
       for(int i=2; i<a; i++)
       {
            fact *= i;
       }
       System.out.println("Factorial of "+a+" is "+fact);
    }
}


//Recursion 

// public class Factorial
// {

//     public static int fact(int a)
//     {
//         if(a==0 || a==1)
//         {
//             return 1;
//         }
//            return a * fact(a-1);
//     }
//     public static void main(String[] args) 
//     {
//         int a=6;
//         System.out.println("Factorial of "+a+ " is " +fact(a));
//     }
// }

// 1 to 50

// import java.math.BigInteger;

// public class Factorial 
// {
//     public static void main(String[] args) 
//     {
//         BigInteger fac=BigInteger.ONE;
//         // int fac = 1;
//         for(int i=2; i<=50; i++)
//         {
//             fac = fac.multiply(BigInteger.valueOf(i));
//             // fac *= i;
//             System.out.println("Factorial of "+i+" is: "+fac);
//         }
//     }
// }
