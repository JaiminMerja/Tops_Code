// 1
// 12
// 123
// 1234
// 12345
// 1234
// 123
// 12
// 1

public class Priamid13 
{
    public static void main(String[] args) 
    {
       for(int i=1; i<=5; i++)
       {
            for(int j=1; j<=i; j++)
            {
               System.out.print(j);
            }
            System.out.println();
       }
       for(int i=4; i>=1; i--)
       {
            for(int j=1; j<=i; j++)
            {
               System.out.print(j);
            }
            System.out.println();
       }
    }
}
