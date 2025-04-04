package module.oops;
class Sum
{
    int x,y;
    public Sum()   //Default
    {
        x=10;
        y=20;
        System.out.println("First Sum is:"+(x+y));
    }
    public Sum(int a)   //Parameterized
    {
        x=a;
        y=a;
        System.out.println("Second Sum is:"+(x+y));
    }
    public Sum(int a, int b)   //Parameterized
    {
        x=a;
        y=b;
        System.out.println("Second Sum is:"+(x+y));
    }
}
public class ConstructorDemo 
{
    public static void main(String[] args) 
    {
    SumRecursion s1 = new SumRecursion();
    new Sum(12);
    new Sum(45, 65);
    }
}