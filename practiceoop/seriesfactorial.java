//s=x!+2x!+4x!+8x!....

import java.util.*;
class seriesfactorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the terms");
        int n=sc.nextInt();
        System.out.println("enter the value of x ");
        int m=sc.nextInt();
        int f=1,k=1;
        long s=0l;
        for(int i=1;i<=n;i++)
        {
            m=m*k;
            f=1;
            for(int j=1;j<=m;j++)
            {
                f=f*j;
            }
            s=s+f;
            k=k*2;
        }
        System.out.println(s);
    }
}

 