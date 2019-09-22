/*1,21,321,4321,54321,654321.....n terms
 * input is 'n' &we get the terms upto n;*/
 

import java.util.*;
class series2
{
    public static void main(int n)
    {
        int i,k,l;
        for(i=1;i<=n;i++)
        {
            l=0;
            k=i;
            while(k>0)
            {
                l=(int)(k*Math.pow(10,k-1))+l;
                k--;
            }
            System.out.print(l+",");
        }
    }
}