package module.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        System.out.println("Default size:"+v.size());
        System.out.println("Default capacity:"+v.capacity());
        System.out.println("Default value:"+v);
        v.add(100);
        v.add("Dark");
        v.add('X');
        v.add(new Integer(143));
        v.add("Stranger Things");
        System.out.println("New size:"+v.size());
        System.out.println("New capacity:"+v.capacity());
        System.out.println("New value:"+v);
        v.addFirst(1000);
        System.out.println("New size:"+v.size());
        System.out.println("New capacity:"+v.capacity());
        System.out.println("New value:"+v);
        v.addLast("Money Heist");
        System.out.println("New size:"+v.size());
        System.out.println("New capacity:"+v.capacity());
        System.out.println("New value:"+v);

        System.out.println("New size:"+v.size());
        System.out.println("New capacity:"+v.capacity());
        System.out.println("New value:"+v.contains("Dark"));

        Iterator i1 = v.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }
        // Enumeration e1 = v.elements();
        // while(e1.hasMoreElements())
        // {
        //     System.out.println(e1.nextElement());
        // }
    }
}
