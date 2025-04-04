package module.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializable 
{
    public static void main(String[] args) 
    {
        Deserializable d = new Deserializable();
        Address a1 = d.getDeserializableData();
        System.out.println(a1);
    }
    public Address getDeserializableData()
    {
        Address address = null;
        try
        {
            FileInputStream fis = new FileInputStream("abc.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            address=(Address)ois.readObject();
            ois.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return address;
    }
}
