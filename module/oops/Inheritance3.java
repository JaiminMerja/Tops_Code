package module.oops;
//Hierarchical Inheritance
class Parent 
{
    String PName;
    
    public void SetParent()
    {
        PName = "KiritKumar P Merja";
    }
}
class Child1 extends Parent
{
    String C1Name;

    public void SetChild1()
    {
        C1Name = "Jaimin";
    }
    public void display()
    {
        System.out.println(C1Name+" "+PName);
    }
}
class Child2 extends Parent
{
    String C2Name;

    public void SetChild2()
    {
        C2Name = "Dhatri";
    }
    public void display()
    {
        System.out.println(C2Name+" "+PName);
    }
}
public class Inheritance3 
{
    public static void main(String[] args)
    {
        Child1 c1 = new Child1();
        c1.SetParent();
        c1.SetChild1();
        c1.display();

        Child2 c2 = new Child2();
        c2.SetParent();
        c2.SetChild2();
        c2.display();
    }
}
