package module.oops;
public class String1 
{
    public static void main(String[] args)
    {
        String s1 = new String("I am captain Jack Sparrow");
        System.out.println("Orginal String:"+s1);
        System.out.println("Length:"+s1.length());
        System.out.println("UpperCase is:"+s1.toUpperCase());
        System.out.println("LowerCase is:"+s1.toLowerCase());
        System.out.println("Substring:"+s1.substring(2));
        System.out.println("SubString 2:"+s1.substring(4, 6));
        System.out.println("Charater is:"+s1.charAt(8));
        System.out.println("Compare String:"+s1.compareTo("Bond James Bond"));
        System.out.println("New String:"+s1);
        System.out.println("Length 2:"+s1.length());
        System.out.println("Concat:"+s1.concat(s1));
        char[] c = s1.toCharArray();
        {
            for(int i=c.length-1; i>=0; i--)
            {
                System.out.print(c[i]);
            }
        }

    }
}
