/*
 * 3 2
4 1
5 3
2 4
7 1
8 1
 * 
 * 
 */


import java.util.*;
class feqsort
{
    public static void main(String args[])
    {
        int a1[]={3,4,5,2,7,2,8,2,5,2,5,3};
        int l=a1.length;
        int a2[]=new int[l];
        boolean v[]=new boolean [l];
        int max=0;
        for(int i=0;i<a1.length-1;i++)
        {
            if(v[i]==true)
                continue;

            int c=1;
            for(int j=i+1;j<a1.length;j++)
            {
                
                if(a1[i]==a1[j])
                {
                    v[j]=true;
                    c++;
                }
                
            }
            //a2[i]=a1[i];
            
            System.out.println(a1[i]+" "+c );
        }
        
    }
}