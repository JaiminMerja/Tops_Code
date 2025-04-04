package module.oops;
// public class Array5
// {
//     public static void main(String[] args) 
//     {
//         int a[] = {21,124,123,13454,11,2323145};
//         int min = a[0];
//         for(int i=1; i<a.length; i++)
//         {
//             while(a[i] < min)
//             {
//                 a[i] = min;
//             }
//         }
//         System.out.println("Minimum value:"+min);
//     }
// }


// 2nd Minmum Value

public class Array5 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] < first)
            {
                second = first;
                first = a[i];
            }
            else if(a[i] < second && a[i] != first)
            {
                second = a[i];
            }
        }
        System.out.println("Second min:"+second);
    }    
}
