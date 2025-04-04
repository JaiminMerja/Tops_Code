package module.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        LinkedList l = new LinkedList();
        System.out.println("Default Size is:"+l.size());
        System.out.println("Default Value is:"+l);
        l.add("JWHD");
        l.add(1);
        l.add(23.45f);
        l.add('Z');
        l.add(new Integer(143));
        System.out.println("New Size is:"+l.size());
        System.out.println("New Value is:"+l);
        l.addFirst("James Bond");
        l.addLast("Mission Impossible");
        System.out.println("New Size is:"+l.size());
        System.out.println("New Value is:"+l);
        l.remove(4);
        System.out.println("New Size is:"+l.size());
        System.out.println("New Value is:"+l);
        Iterator i = l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
