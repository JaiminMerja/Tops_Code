package module.oops;
//Arithemetic Sum

import java.util.Scanner;

public class Matrix 
{
    public static void main(String[] args) 
    {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        
        Scanner s = new Scanner(System.in);
        System.out.println("Matrix A");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Enter value for A:");
                a[i][j]=s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix B");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Enter value for B:");
                b[i][j]=s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Addition");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Subtraction");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
