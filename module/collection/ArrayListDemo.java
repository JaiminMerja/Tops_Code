package module.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList a = new ArrayList();
        System.out.println("Default Size is:"+a.size());
        System.out.println("Default Value is:"+a);
        a.add(1);
        a.add("Jaimin");
        a.add('M');
        a.add(56.32f);
        a.add(new Integer(124));
        a.add("Jaimin");
        System.out.println("New Size is:"+a.size());
        System.out.println("New Value is:"+a);
        a.remove(2);
        System.out.println("New Size is:"+a.size());
        System.out.println("New Value is:"+a);
        a.remove("Jaimin");
        System.out.println("New Size is:"+a.size());
        System.out.println("New Value is:"+a);
        a.addFirst('J');
        System.out.println("New Size is:"+a.size());
        System.out.println("New Value is:"+a);
        a.addLast("Merja");
        System.out.println("New Size is:"+a.size());
        System.out.println("New Value is:"+a);
        System.out.println("M is there or not:"+a.contains('M'));
        a.clone();
        System.out.println("Cone is:"+a);
        a.clear();
        System.out.println("New Size is:"+a.size());
        System.out.println("New Value is:"+a);
    }    
}
