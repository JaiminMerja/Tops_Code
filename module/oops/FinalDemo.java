package module.oops;
final class FDemo
{
    final int n=100;
    String name;
    public final void setData()
    {
        name="Jimmy";
    }
    public void display()
    {
        System.out.println("No is:"+n);
        System.out.println("Name is:"+name);
    }
}
public class FinalDemo 
{
    public static void main(String[] args) 
    {
        FDemo f1 = new FDemo();
        f1.setData();
        f1.display();
    }
}
