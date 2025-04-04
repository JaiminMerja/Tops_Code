package module.io;

import java.io.FileWriter;

public class CharacterStream 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fw = new FileWriter("a2.txt");
            String s = "This is my world...";
            fw.write(s);
            fw.flush();
            fw.close();
            System.out.println("File Write....");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
