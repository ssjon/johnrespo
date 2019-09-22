import java.util.*;
class quicksort
{
    public static void quick(int a[], int f, int l)
    {
        int i=0,j=0;
        if(f<l)
        {
            int pivot=a[f];
            i=f;
            j=l;
            while(i<=j)
            {
                while(i<=j && pivot>=a[i])
                    i++;

                while(pivot<a[j])
                    j--;
                if(i<j)
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            int t=a[j];
            a[j]=a[f];
            a[f]=t;

            quick(a,f,j-1);
            quick(a,j+1,l);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the oder");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        quick(a,0,x-1);
        for(int i=0;i<x;i++)
            System.out.print(a[i]+" ");
    }
}
 