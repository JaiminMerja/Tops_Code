package module.oops;
//Vowels
import java.util.Scanner;

public class String3 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int vowel = 0;

        for (int i = 0; i < a.length(); i++) 
        {
            char c = a.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
            {
                vowel++; 
            }
        }
        System.out.println("Number of vowels: " + vowel);
        s.close(); 
    }
}
