package module.oops;
import java.util.Arrays;

//Sorting Array
public class Array8 
{
    public static void main(String[] args) 
    {
        int a[] = {3,4,5,1,7,6,12,8,9,11,18};
        Arrays.sort(a);
        System.out.println("Sorted Array are:");
        for(int b : a)
        {
            System.out.println(b);
        }
    }
}