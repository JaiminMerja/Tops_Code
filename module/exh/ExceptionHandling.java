package module.exh;

import java.util.Scanner;

public class ExceptionHandling 
{
    public static void main(String[] args)
    {
        try 
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter A:");
            int a = s.nextInt();
            System.out.println("Enter B:");
            int b = s.nextInt();
            int c = a/b;
            System.out.println("Division is:"+c);
            System.out.println("Program is Completed....");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Program is Simple");    
        }
    }
}
