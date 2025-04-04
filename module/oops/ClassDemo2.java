package module.oops;
class Employee 
{
    int id,salary,da,hr,pf;
    String name;

    public void setValue()
    {
        id=1;
        name="Jaimin";
        da=5000;
        hr=6000;
        pf=1000;
    }
    public int cal()
    {
        return (salary+da+hr-pf);
    }
    public void display()
    {
        System.out.println("Id is:"+id);
        System.out.println("Name is:"+name);
        System.out.println("Da is:"+da);
        System.out.println("Hr is:"+hr);
        System.out.println("Pf is:"+pf);
        System.out.println("Net Salary is:"+cal());
    } 
}
public class ClassDemo2 
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        e.setValue();
        e.cal();
        e.display();
    }
}
