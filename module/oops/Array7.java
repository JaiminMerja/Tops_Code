package module.oops;
//Reverse Array
public class Array7 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        int left = 0, right = a.length-1;
        if(left < right)
        {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left ++;
            right --;
        }
        System.out.println("Reverese Array");
        for(int b:a)
        {
            System.out.print(b+" ");
        }
    }
}