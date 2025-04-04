package module.oops;
// Sum of the Digits
import java.util.Scanner;

public class SumAndCountofDigits 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = s.nextInt();
        int sum = 0;

        while(a!=0) 
        {
            sum += a % 10;
            a /= 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}


// Count the number of Digit

// public class SumAndCountofDigits 
// {
//     public static void main(String[] args) 
//     {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int a = s.nextInt();
//         int sum = 0;

//         while(a!=0) 
//         {
//             a /= 10;
//             sum++;
//         }
//         System.out.println("Sum of Digits:"+sum);
//     }
// }