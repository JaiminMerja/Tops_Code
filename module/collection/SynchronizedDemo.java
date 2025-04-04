package module.collection;

class Message
{
    public void display(String msg)
    {
        System.out.print(" [ "+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.print(" ] "+msg);
    }
}
class synch extends Thread
{
    Message m;
    String msg;
    public synch(String msg, Message m)
    {
        this.m=m;
        this.msg=msg;
    }
    public void run()
    {
        synchronized (m) 
        {
            m.display(msg);
        }
    }
}
public class SynchronizedDemo 
{
    public static void main(String[] args) 
    {
        Message m1 = new Message();
        synch s1 = new synch("Pirates of Carbbian", m1);
        synch s2 = new synch("Transformer", m1);
        synch s3 = new synch("Harry Potter", m1);
        s1.start();
        s2.start();
        s3.start();
    }
}
