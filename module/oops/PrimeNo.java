package module.oops;
public class PrimeNo 
{
    public static void main(String[] args) 
    {
        for(int i=2; i<=500; i++)
        {
            int count = 0;
            for(int j=2; j<=Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 0)
                {
                    System.out.println(i +" ");
                }
        }
    }
}


//Other way
// import java.util.Scanner;

// public class PrimeNo 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         boolean isPrime = true;
//         if (n <= 1) 
//         {
//             isPrime = false;
//         } 
//         else 
//         {
//             for (int i = 2; i < n; i++) 
//             {  
//                 if (n % i == 0) 
//                 {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if (isPrime)
//             System.out.println(n + " is a prime number.");
//         else
//             System.out.println(n + " is not a prime number.");
//     }
// }
