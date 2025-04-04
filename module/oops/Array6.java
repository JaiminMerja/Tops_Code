package module.oops;
//Sum of all emelent in Array
public class Array6 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum = 0;
        for(int b : a)
        {
            sum += b;
        }
        System.out.println(sum);
    }
}
