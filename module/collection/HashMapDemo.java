package module.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
        HashMap hm = new HashMap();
        System.out.println("Default Size is:"+hm.size());
        System.out.println("Default Value is:"+hm);
        hm.put(1, "Jack Sparrow");
        hm.put(2, "Lucifer Morningstar");
        hm.put(3, "James Bond");
        System.out.println("New Size is:"+hm.size());
        System.out.println("New Value is:"+hm);

        Set s = hm.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext())
        {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println("Key:"+me.getKey());
            System.out.println("Value:"+me.getValue());
            System.out.println();

            // String[] s1 = i.next().toString().split("=");
            // System.out.println("Key:"+s1[0]);
            // System.out.println("Value:"+s1[1]);
        }
    }
}
