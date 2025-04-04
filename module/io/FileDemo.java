package module.io;

import java.io.File;

class FDemo
{
    File file;
    public FDemo()
    {
        file = new File("a3.txt");
        try
        {
            file.createNewFile();
            display();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void display()
    {
        System.out.println("Is Directory or Not..."+file.isDirectory());
        System.out.println("Is File or Not..."+file.isFile());
        System.out.println("Is read or Not..."+file.canRead());
        System.out.println("Is Write or Not..."+file.canWrite());
        System.out.println("Is Execute or Not..."+file.canExecute());
        System.out.println("File Name is..."+file.getName());
        System.out.println("File Path is..."+file.getPath());
        System.out.println("File exact Path..."+file.getAbsolutePath());
    }
}
public class FileDemo 
{
    public static void main(String[] args) 
    {
        new FDemo();
    }
}
