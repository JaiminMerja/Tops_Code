package module.oops;
class SDemo
{
    int a;
    static int b;
    static class SDemo1
    {
        public static void show()
        {
            // a=1;
            b = 786;
            // System.out.println("Value 1:"+a);
            System.out.println("Value 2:"+b);
        }
    }
    static 
    {
        b = 143;
        System.out.println("Static number is in block:"+b);
    }
}
public class StaticDemo 
{
    public static void main(String[] args) 
    {
        SDemo s1 = new SDemo();
        SDemo s2 = new SDemo();
        SDemo s3 = new SDemo();
        SDemo.SDemo1.show();
        s1.a=10;
        s2.a=20;
        s3.a=30;
        System.out.println("S1 number:"+s1.a);
        System.out.println("S2 number:"+s1.a);
        System.out.println("S3 number:"+s1.a);
        s1.b=10;
        s1.b=20;
        s1.b=30;
        System.out.println("New S1 number:"+s1.b);
        System.out.println("New S2 number:"+s1.b);
        System.out.println("New S3 number:"+s1.b);
    }
}
