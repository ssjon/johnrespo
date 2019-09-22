import java.util.*;
class gcdmultiple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the order");
        int x=sc.nextInt();
        int min=0;
        int h=0;
        int mul=1;
        int a1[] = new int [x];
        System.out.print("enter the nos");
        for(int i=0;i<x;i++)
        {
            a1[i]=sc.nextInt();
        }
        min=a1[0];
        for(int j=0;j<a1.length;j++)
        {

            if(min>a1[j])
            {
                min=a1[j];
            }

        }
        //System.out.print(min);
        for(int k=1;k<min;k++)
        {
            if(min%k==0)
            {
                h=k;
            }
        }
        System.out.println(h);
        for(int l=0;l<a1.length;l++)
        {
            mul=mul*a1[l];
        }
        int z=(mul)/h;
        System.out.println(z);
    }
}


