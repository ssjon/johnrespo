import java.util.*;
class nonfibo
{
    boolean fibo(int n)
    {
        int n1=0,n2=1,n3=0;
        while(n3<n)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        if(n==n3)
            return false;
        else
            return true;
    }
}

