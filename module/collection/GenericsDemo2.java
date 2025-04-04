package module.collection;


import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> a1 = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Jack Sparrow");
        s1.setCity("Totuga");

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Money Hiest");
        s2.setCity("Spain");

        a1.add(s1);
        a1.add(s2);

        System.out.println(s1);

        Iterator<Student> i1 = a1.iterator();
        while(i1.hasNext())
        {
            Student s = (Student)i1.next();
            System.out.println("id is:"+s.getId());
            System.out.println("name is:"+s.getName());
            System.out.println("city is:"+s.getCity());
        }
    }
}
