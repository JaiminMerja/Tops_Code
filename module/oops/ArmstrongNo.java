package module.oops;
import java.util.Scanner;

public class ArmstrongNo
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number:");
      int a = s.nextInt();
      int copy=a, sum=0;
      while(a>0)
      {
          int t = a % 10;
          sum = sum + (t*t*t);
          a = a/10;
      }
      if (copy == sum)
      {
          System.out.println("Armstrong");
      }
      else
      {
          System.out.println("Not a Armstrong");
      }
    }
}


// 1 to 1000
// public class ArmstrongNo 
// {
//     public static void main(String[] args) 
//     {
//         for (int i = 1; i <= 1000; i++) 
//         {
//             int s = 0, n = i, temp = i;

//             while (temp > 0) 
//             {
//                 int t = temp % 10;
//                 s = s + (t * t * t);
//                 temp = temp / 10;
//             }

//             if (s == n) 
//             {
//                 System.out.println("Number is Armstrong: " + s);
//             }
//         }
//     }
// }
