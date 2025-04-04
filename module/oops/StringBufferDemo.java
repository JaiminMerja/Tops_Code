package module.oops;
public class StringBufferDemo 
{
    public static void main(String[] args) 
    {
        StringBuffer s1 = new StringBuffer("I am the king of my world");
        System.out.println("Orginal String:"+s1);
        System.out.println("Length of String:"+s1.length());

        s1.insert(0, "Lucifer:");
        System.out.println("Orginal String:"+s1);
        System.out.println("Length of String:"+s1.length());

        s1.append(" and I am Back");
        System.out.println("Orginal String:"+s1);
        System.out.println("Length of String:"+s1.length());

        s1.delete(34, 48);
        System.out.println("Orginal String:"+s1);
        System.out.println("Length of String:"+s1.length());
    }
}
