package module.oops;

import java.util.Scanner;

public class String6 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        String rev="";
        for(int i=a.length()-1; i>=0; i--)
        {
            rev += a.charAt(i);
        }
        System.out.println("Reverese:"+rev);
    }
}
