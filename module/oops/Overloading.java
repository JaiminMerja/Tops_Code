package module.oops;
class calculator
{
    int sum (int a, int b)
    {
        return a+b;
    }
    double sum (double a, double b, double c)
    {
        return a+b+c;
    }
    float sum (float a, float b, float c, float d)
    {
        return a+b+c+d;
    }
}
public class Overloading 
{
    public static void main(String[] args) 
    {
        calculator c1 = new calculator();
        System.out.println("Sum 1 is:"+c1.sum(4, 3));
        System.out.println("Sum 2 is:"+c1.sum(12.1, 13.4, 14.6));
        System.out.println("Sum 3 is:"+c1.sum(10.5f, 20.5f, 30.5f, 40.5f));    
    }
}
