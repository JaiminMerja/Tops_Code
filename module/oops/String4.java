package module.oops;
//Count space,digit,letter,specialchars
import java.util.Scanner;

public class String4 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String b = s.nextLine();
        int spaces = 0, letters = 0, digits = 0, specialChars = 0;

        for (int i = 0; i < b.length(); i++) 
        {
            char c = b.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) 
            {
                letters++;
            } 
            else if (c >= '0' && c <= '9') 
            {
                digits++;
            } 
            else if (c == ' ') 
            {
                spaces++;
            } 
            else 
            {
                specialChars++;
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Spaces: "+spaces);
        System.out.println("Special Characters: "+specialChars);

        s.close(); 
    }
}
