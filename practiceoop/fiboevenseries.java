import java.util.*;
class fiboevenseries
{
    int n1=0,n2=1,n3=0;
    boolean fibo(int a)
    {
        

        while(n3<a)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        if(a==n3)
            return true;
        else
            return false;
    }

    boolean prime(int n)
    {
        int f=0;
        for(int j=1;j<=n;j++)
        {
            if(n%j==0)

                f++;
        }
        if(f==2)
            return true;
        else
            return false;
    }

}

