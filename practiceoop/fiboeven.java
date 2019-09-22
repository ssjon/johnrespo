import java.util.*;
class fiboeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        fiboevenseries fe=new fiboevenseries();
        System.out.print ("enter the no of term");
        int x=sc.nextInt();
        int p=2,f=1;
        for(int i=1;i<=x;i++)
        {
            if(i%2==0)
            {
                while(fe.prime(p)==false)
                    p++;

                System.out.println(p);
                p++;
            }
            else
            {
                while(fe.fibo(f)==false)
                    f++;
                System.out.println(f);
                f++;
            }
        }
    }
}
