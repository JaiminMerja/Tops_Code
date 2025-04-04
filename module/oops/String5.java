package module.oops;
//Total Letters and characters
import java.util.Scanner;

public class String5
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        int totalcharacters = 0, letters = 0;
        
        for(int i=0; i<a.length(); i++)
        {
            char b = a.charAt(i);
            totalcharacters++;

            if ((b >='a' && b <='z') || (b >='A' && b<='Z'))
            {
                letters++;
            }
        }
        System.out.println("Total Characters are:"+totalcharacters);
        System.out.println("Total Letters (Alphabets):"+letters);
    }
}
