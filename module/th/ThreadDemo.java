package module.th;

class First extends Thread
{
    public void run()
    {
        for (int i=1; i<=5; i++) 
        {
            System.out.println("My first Thread is:"+i);
            try 
            {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("My First Thread Completed...");
    }
}
public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        First f1 = new First();
        f1.start();
        for (int i=1; i<=5; i++) 
        {
            System.out.println("My First Thread is:"+i);
            try 
            {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("My First Thread Completed...");
    }
    
}
