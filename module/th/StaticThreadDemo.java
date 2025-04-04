package module.th;

public class StaticThreadDemo 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread();
        System.out.println(t);
        t.setName("Jack Sparrow");
        System.out.println(t);
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);
        System.out.println("Thread is alive or not..."+t.isAlive());
        System.out.println(t.isDaemon());
    }
}
