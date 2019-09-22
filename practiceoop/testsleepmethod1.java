//import java.util.*;
class testsleepmethod1 extends Thread
{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try{
                Thread.sleep(1200);
            }

            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}