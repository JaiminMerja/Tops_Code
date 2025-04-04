package module.zpk1;

public class Car 
{
    int cid;
    String name,model,price;
    public void setCarData()
    {
        name="Bugatii";
        model="Sportz";
        price="10 cr";
        cid=1;
    }
    public void display()
    {
        System.out.println("Name of car is:"+name);
        System.out.println("Model of car is:"+model);
        System.out.println("Price of car is:"+price);
        System.out.println("Id of car is:"+cid);
    }
}
