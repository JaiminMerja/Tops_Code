package module.oops;
class bike 
{
    void speed()
    {
        System.out.println("Bike speed is 140km/hr");
    }
}
class car extends bike
{
    @Override
    void speed()
    {
        System.out.println("Car speed is 242km/hr top speed");
    }
}
public class Overridingexg 
{
    public static void main(String[] args) 
    {
        car c = new car();
        c.speed();
    }
}
