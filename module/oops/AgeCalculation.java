package module.oops;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculation 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Birth Year:");
        int a = s.nextInt();
        int b = LocalDate.now().getYear();
        int c = b - a;
        System.out.println("Age is:"+c);
    }
}
