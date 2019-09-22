import java.util.*;
class facinating 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int x=sc.nextInt();
        int y=2*x;
        int z=3*x;
        int f=0,flag=0;
        String r=""+x+y+z;
        long c=Long.parseLong(r);
        System.out.println(c);
        while(c!=0)
        {
            long a=c%10;
            f=0;
            for(long i=1;i<10;i++)
            {
                if(i==a)
                {
                    f++;
                }
            }
            if(f!=1)
            {
                flag=1;
                break;
            }
            c=c/10;
        }
        if(flag==1)
            System.out.println("not facinating no");
        else
            System.out.println("facinating no");
    }
}
