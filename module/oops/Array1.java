//How to print array
package module.oops;

import java.util.Scanner;

public class Array1 
{
    public static void main(String[] args) 
    {
        int[] a = new int[5]; //to store value 0 to 4
        
        //Direct Calling

        // for(int i=0; i<5; i++)
        // {
        //     a[i] = i;
        //     System.out.println(a[i]);
        // }

        //User Input

        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter value:");
            a[i] = s.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            System.out.println("Array is:"+a[i]);
        }
    }    
}
