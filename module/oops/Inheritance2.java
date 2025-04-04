package module.oops;
class Person
{
    String name;

    public void SetPerson()
    {
        name="James Bond";
    }
}
class Number extends Person
{
    int no;
    
    public void SetNumber()
    {
        no = 007;
    }
    public void display()
    {
        System.out.println("Name is:"+name);
        System.out.println("Agnet Number:"+no);
    }
}
class Movies extends Number 
{
    int pictures;

    public void SetMovie()
    {
        pictures = 30;
    }
    public void display()
    {
        
        System.out.println("Name is:"+name);
        System.out.println("Agnet Number:"+no);
        System.out.println("Number of Movies:"+pictures);
    }
}
public class Inheritance2
{
    public static void main(String[] args) 
    {
        Movies m = new Movies();
        m.SetPerson();
        m.SetNumber();
        m.SetMovie();
    }
}