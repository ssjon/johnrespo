/*enter the order
4
enter the no
1
8
9
7
1 =0

8 =0

9 =0

7 =0

18 =0

89 =0

97 =0

189 =0

897 =0

1897 =0
*/


import java.util.*;
class subarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        int a1[]=new int[x];
        System.out.println("enter the no");
        for(int i=0;i<x;i++)
            a1[i]=sc.nextInt();

        int k=0,m,m1=0;
        int s;
        while(k<x)
        {

            for(int j=0;j<x-k;j++)
            {
                s=0;m=0;
                for(int i=j;i<=j+k;i++)
                {

                    System.out.print(a1[i]);
                    s=(s+a1[i]);

                    if(s<0)
                        m=s;
                }
                //if(m>m1)
                // m1=m;

                //for(int z=i;z<=k;z++)
                System.out.println(" ="+m);
                System.out.println();
                //System.out.println(m1);
            }
            k++;
        }
        //System.out.println(m1);
    }
}

        