package module.oops;
public class SortInsertion 
{
    public static void printArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int a[] = {232,13,2316,8574,77,46};
        for(int i=0; i<a.length; i++)
        {
            int current = a[i];
            int j=i-1;
            while (j>= 0 && a[j] > current)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        printArray(a);
    }
}
