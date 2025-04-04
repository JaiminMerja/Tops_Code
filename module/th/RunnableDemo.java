package module.th;

class Second implements Runnable
{
    @Override
    public void run()
    {
        for (int i=1; i<=5; i++) 
        {
            System.out.println("My Second Thread is.."+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("My Second Thread is Completed..");
    }
}
public class RunnableDemo 
{
   public static void main(String[] args) 
   {
        Second s1 = new Second();
        Thread t = new Thread();
        t.start();

        for (int i=1; i<=5; i++) 
        {
            System.out.println("My Second Thread is.."+i);
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("My Second Thread is Completed..");
   }
}
