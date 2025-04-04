package module.oops;
interface admin
{
    String aname = "Jack Sparrow";
}
public interface  InterfaceStudent 
{
    int sno =123;
    public void display();
    // default void show()
    // {
    //     System.out.println("Interface sno is:"+sno);
    // }
    public static void show()
    {
        System.out.println("Interface sno is:"+sno);
    }
}
