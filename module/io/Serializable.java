package module.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable 
{
    public static void main(String[] args) 
    {
        Serializable s = new Serializable();
        s.setSerializableData();
    }
    public void setSerializableData()
    {
        Address a = new Address();
        a.setCountry("India");
        a.setState("Gujarat");
        a.setCity("Jamnagar");

        try
        {
            FileOutputStream fos = new FileOutputStream("abc.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.flush();
            fos.flush();
            fos.close();
            System.out.println("Data Write...");    
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
