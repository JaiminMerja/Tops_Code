package module.oops;
class Car 
{
    String name, model;
    int price;
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getModel() 
    {
        return model;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }
    public int getPrice() 
    {
        return price;
    }
    public void setPrice(int price) 
    {
        this.price = price;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
    Car c = new Car();
    c.setName("Bugatti");
    System.out.println("Car name is:"+c.getName());
    c.setModel("Type 41 and 57 are The Royal and The Atlantic");
    System.out.println("Models name are:"+c.getModel());
    c.setPrice(200000000);
    System.out.println("Total Price of 2 car:"+c.getPrice());
    }
}    

