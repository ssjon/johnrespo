import java.util.*;
class increasingarrno
{
    private int a1[];
    private int x,y;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        x=sc.nextInt();
        a1=new int[x+1];
    }

    void fill()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x;i++)
        {
            a1[i]=sc.nextInt();
        }
    }

    void op()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        y=sc.nextInt();
        int i=x-1;
        x++;
        while(y<a1[i] && i>=0)
        {
            a1[i+1]=a1[i];
            i--;
        }
        a1[i+1]=y;

    }

    void print()
    {
        for(int i=0;i<x;i++)
            System.out.println(a1[i]);
    }
}
