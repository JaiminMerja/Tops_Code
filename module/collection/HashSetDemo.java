package module.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
    public static void main(String[] args) 
    {
        HashSet h1 = new HashSet();
        System.out.println("Default Size is:"+h1.size());
        System.out.println("Default Value is:"+h1);
        h1.add(124);
        h1.add("Jimmy");
        h1.add('X');
        System.out.println("New Size is:"+h1.size());
        System.out.println("New Value is:"+h1);
        h1.remove('X');
        System.out.println("New Size is:"+h1.size());
        System.out.println("New Value is:"+h1);
        Iterator i = h1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
