import java.util.*;
class selectionsort
{
    private int x,min=0,p,c=0;
    private int a1[];
    void input()
    {
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the order");
            x=sc.nextInt();
            a1=new int[x];
        }
    }

    void fill()
    {
        {
            Scanner sc=new Scanner (System.in);

            for(int i=0;i<a1.length;i++)
            {
                System.out.println("enter the nos"+i);
                a1[i]=sc.nextInt();
            }
        }
    }

    void sort()
    {

        for(int i=0;i<a1.length-1;i++)
        {
            int temp=a1[i];
            p=i;
            for(int j=i+1;j<a1.length;j++)
            {
                if(a1[j]<temp)
                {
                    temp=a1[j];
                    p=j;
                }
            }
            if(i!=p)
            {
                int t=a1[i];
                a1[i]=a1[p];
                a1[p]=t;
                c++;
            }

        }
        System.out.println("sorted no are");
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);

        }
        System.out.println(c);
    }
}