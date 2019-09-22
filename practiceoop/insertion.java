import java.util.*;
class insertion
{
    private int x,c,s=0;
    private int a5[];
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the order");
        x=sc.nextInt();
        a5=new int[x];
    }

    void fill()
    {
        Scanner sc=new Scanner (System.in);

        for(int i=0;i<a5.length;i++)
        {
            System.out.println("enter the nos"+i);
            a5[i]=sc.nextInt();
        }
    }

    void sort()
    {
        for(int i=1;i<a5.length;i++)
        {
            int j=i,c=0;
            while(j>0 && a5[j-1]>a5[j])
            {
                int temp=a5[j];
                a5[j]=a5[j-1];
                a5[j-1]=temp;
                j--;
                c++;
            }
            System.out.println(Arrays.toString(a5));
            s+=c;
        }
        System.out.println("after sorting");
        for(int i=0;i<a5.length;i++)
        {
            System.out.println(a5[i]);
        }
        System.out.println(s);
    }
}

