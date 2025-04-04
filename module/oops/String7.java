package module.oops;
// Find Second last character and count how many times it occurs after reverse the string
import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        String reverse = "";

        for (int i = a.length() - 1; i >= 0; i--) 
        {
            reverse += a.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);
        
        //Second Last Character
        if (reverse.length() >= 2) 
        {
            char secondLastChar = reverse.charAt(reverse.length() - 2);
            System.out.println("Second last character after reverse is: " + secondLastChar);

            //count how many times it occurs
            int count = 0;
            for (int i = 0; i < reverse.length(); i++) 
            {
                if (reverse.charAt(i) == secondLastChar) 
                {
                    count++;
                }
            }
            System.out.println("The character '" + secondLastChar + "' appears " + count + " times in the reversed string.");
        } 
        else 
        {
            System.out.println("String is too short to find the second last character.");
        }
    }
}
