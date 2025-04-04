package module.oops;
//Merge two Array
public class Array3 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int l1 = a.length;
        int l2 = b.length;
        int c[] = new int[l1+l2];

        for(int i=0; i<l1; i++)
        {
            c[i] = a[i];
        }
        for(int i=0; i<l2; i++)
        {
            c[i+l1] = b[i];
        }
        System.out.println("Merge Array");
        for(int d : c)
        {
            System.out.print(d+" ");
        }
    }
}
