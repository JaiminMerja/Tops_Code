package module.oops;
abstract class kid
{
    abstract void play();
}
class adult extends kid
{
    void play()
    {
        System.out.println("Adults are seeing their kids play");
    }
}
public class AbstractDemo 
{
    public static void main(String[] args) 
    {
        adult a = new adult();
        a.play();
    }
}
