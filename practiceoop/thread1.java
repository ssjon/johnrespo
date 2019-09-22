class thread1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            System.out.println(i);
        }

    }

    public static void main(String args[])
    {
        Runnable runn =new thread1();
        Thread T1= new Thread(runn);
        Thread T2= new Thread(runn);
        T1.start();
        T2.start();
    }

}
 