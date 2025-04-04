package module.collection;

import java.util.TreeSet;

public class TreeSetDemo 
{
    public static void main(String[] args) 
    {
        TreeSet<String> t = new TreeSet<>();
        t.add("Jaimin Kiritkumar Merja");
        t.add("Kiritkumar Prabhulal Merja");
        t.add("Rekha Kiritkumar Merja");
        System.out.println("Treeset is:"+t);
        System.out.println("New:"+t.getFirst());
        System.out.println("New Name added:"+t);
        System.out.println("New 2:"+t);
        System.out.println("Check:"+t.contains("Jimmy"));
    }
}
