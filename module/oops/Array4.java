package module.oops;
// public class Array4
// {
//     public static void main(String[] args) 
//     {
//       int a[] = {237,123,124,132,145};
//       int max = a[0];
//       for(int i=1; i<a.length; i++)
//       {
//         while(a[i] > max)
//         {
//           a[i] = max;
//         }
//       } 
//       System.out.println(max);
//     }  
// }

// 2nd Largest Number

public class Array4
{
    public static void main(String[] args) 
    {
        int[] a = {12, 35, 1, 10, 34, 12};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
          if(a[i] > first)
          {
            second = first;
            first = a[i];
          }
          else if(a[i]>second && a[i] != first)
          {
            second = a[i];
          }
        }
        System.out.println(second);
    }
}
