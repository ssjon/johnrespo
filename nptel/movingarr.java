/*
 * print array all the no greater than 10 will be arrange right side of arrayS
 * 
 15 18 3 20 9 30 2 5 
15 18 3 20 9 30 2 5 
3 18 15 20 9 30 2 5 
3 18 15 20 9 30 2 5 
3 9 15 20 18 30 2 5 
3 9 15 20 18 30 2 5 
3 9 2 20 18 30 15 5 
3 9 2 5 18 30 15 20 
3
9
2
5
18
30
15
20
  
 */


import java.util.*;
class movingarr
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        int a1[]=new int[x];
        int b1[]= new int[x];

        for(int i=0;i<x;i++)
        {
            a1[i]=sc.nextInt();
        }
        int y=0;
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]<10)
            {
                int t=a1[y];
                a1[y]=a1[i];
                a1[i]=t;
                y++;
            }
            for(int j=0;j<a1.length;j++)
                System.out.print(a1[j]+" ");
               System.out.println(); 
        }
        /*for(int i=0;i<a1.length;i++)
        {
        if(a1[i]<10)
        b1[y++]=a1[i];
        }

        for(int i=0;i<a1.length;i++)
        {
        if(a1[i]>=10)
        b1[y++]=a1[i];
        }*/

        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
    }

}