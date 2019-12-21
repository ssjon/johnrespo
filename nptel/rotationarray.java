/*
 rotate array from first and last...
 
 */



import java.util.*;
class rotationarray
{
    private int x,r;
    private int a1[];
    // 10 20 30 40 55
    // 0  1  2   3  4
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        x=sc.nextInt();
        r=sc.nextInt();
        a1=new int[x];
    }

    void fill()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x;i++)
        {
            System.out.println("enter the nos");
            a1[i]=sc.nextInt();
        }
    }

    void rotate()
    {
        for(int i=1;i<=r;i++)
        {
            if(i%2==0)
            {
                /*rotation from last*/
                int temp=a1[x-1]; // last element
                for(int j=x-1;j>0;j--)
                    a1[j]=a1[j-1];

                a1[0]=temp;
            }
            else
            {
                /*rotation from first*/
                int temp=a1[0];
                for(int j=0;j<x-1;j++)
                    a1[j]=a1[j+1];

                a1[x-1]=temp;
            }
        }
    }

    void rotate1()
    {
        for(int i=1;i<=r;i++)
        {
            /*rotation from last*/
            /*int temp=a1[x-1]; // last element
            for(int j=x-1;j>0;j--)
            a1[j]=a1[j-1];

            a1[0]=temp;*/

            /*rotation from first*/
            int temp=a1[0];
            for(int j=0;j<x-1;j++)
                a1[j]=a1[j+1];

            a1[x-1]=temp;

        }
    }

    void show()
    {
        for(int i=0;i<x;i++)
            System.out.print(a1[i]+" ");
    }
}

