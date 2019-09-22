import java.util.*;
class revarray
{
     int a1[],n,c,t;
    int i=0;
     int end=n-1-i;
    void input()
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the order of no. ");
        int n=sc.nextInt();
        a1=new int[n];
        for( i=0;i<n;i++)
        {
            System.out.println("enter the value");
            a1[i]=sc.nextInt();
        }
    }

    void swap()
    {
        for(i=0;i<n;i++) 
        {
            t=a1[i];
            a1[i]=a1[end];
            a1[end]=t;
            end--;

        }
    }

    void show()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a1[i]);
        }

    }

}
