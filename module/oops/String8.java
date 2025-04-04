package module.oops;
//Words Count
import java.util.Scanner;

public class String8 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        String[] words = a.trim().split(" ");
        int wordcount = (a.trim().isEmpty()) ? 0 : words.length;
        System.out.println("Words are:"+wordcount);
    }
}
