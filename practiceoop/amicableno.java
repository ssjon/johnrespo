import java.util.*;
class amicableno
{
    public int ami(int n)
    {
        int r=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                 r=r+i;

            }

        }
        return r;
    }
}