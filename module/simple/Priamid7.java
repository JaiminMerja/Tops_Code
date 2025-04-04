// a
// ab
// abc
// abcd
// abcde
public class Priamid7 
{
    public static void main(String[] args) 
    {
        for(int i=0; i<=5; i++)
        {
            for(int j=0; j<=i; j++) 
            {
                System.out.print((char)(97 + j));
            }
            System.out.println();
        }    
    }
    
}
