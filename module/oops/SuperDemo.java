package module.oops;
class First 
{
    int n;
    String name;
    public First()
    {
        System.out.println("This is the first Class");
    }
    public void setData()
    {
        n=143;
        name="Professor";
    }
}
class Second extends First
{
    int n;
    public Second()
    {
        System.out.println("This is the Second Class");
    }
    public void display()
    {
        System.out.println("Number is:"+super.n);
        System.out.println("Name is:"+name);
    }
}
public class SuperDemo 
{
    public static void main(String[] args) 
    {
        Second s = new Second();
        s.setData();
        s.display();
    }
}
