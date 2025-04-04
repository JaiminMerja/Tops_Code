package module.collection;


import java.util.ArrayList;

public class GenericsDemo1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(new Integer(100));
        System.out.println(a);
    }
}
