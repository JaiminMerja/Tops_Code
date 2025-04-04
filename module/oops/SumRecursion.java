package module.oops;
//Sum of N numbers
public class SumRecursion 
{
    public static void main(String[] args) 
    {
        int a = 7;
        int sum = 0;
        System.out.println("Value:"+add(a, sum));
    }
    public static int add(int a, int sum)
    {
        // Termination Condition
        if(a==0)
        {
            return sum;
        }

        // Logic
        sum += a;
        a--;

        // Recursion call
        return add(a, sum);
    }
}
