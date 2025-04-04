package module.oops;

import java.util.Scanner;

public class ScannerDemo2 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter:");
        int a = s.nextInt();
        System.out.println("Full name:");
        String b = s.nextLine();
    }
}
