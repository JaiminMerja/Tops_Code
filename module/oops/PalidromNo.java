package module.oops;
import java.util.Scanner;

public class PalidromNo 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number:");
       int a = s.nextInt();
       int sum=0, copy=a;
       while(a>0)
       {
            int t = a % 10;
            sum = (sum * 10) + t;
            a = a/10;
       }
       if(copy == sum)
       {
            System.out.println("Palidrom");
       }
       else
       {
            System.out.println("Not Palidrom");
       }
    }
}
