package module.th;

public class DaemonThreadDemo extends Thread 
{
    public void run()
    {
        System.out.println("Daemon Thread is running...");
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void main (String[] args)
    {
        DaemonThreadDemo d = new DaemonThreadDemo();
        d.setDaemon(true);
        d.start();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Main Thread Exiting...");
    }
}

