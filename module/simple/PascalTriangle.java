// 1
// 11
// 121
// 1331
// 14641
public class PascalTriangle 
{
    public static void main(String[] args) 
    {
       int k=1;
       for(int i=1; i<=5; i++)
       {
            System.out.println(k+" ");
            k *= 11;
       }
       System.out.println();
    }
}
