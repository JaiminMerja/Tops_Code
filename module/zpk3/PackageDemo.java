package module.zpk3;
import module.zpk1.Car;

public class PackageDemo 
{
    public static void main(String[] args) 
    {
        Car c1 = new Car();
        c1.setCarData();
        c1.display();

        module.zpk2.Car c2 = new module.zpk2.Car();
        c1.setCarData();
        c1.display();
    }
}
