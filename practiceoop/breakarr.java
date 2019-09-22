import java.util.*;
class breakarr
{
    private int a1[],a,p;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        a=sc.nextInt();
        p=sc.nextInt();
        a1=new int[a];
    }

    void fill()
    {
        int x=a-p;
        //x--;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a;i++)
        {
            if(i<p)
            {
                System.out.println("enter the no");
                a1[i]=sc.nextInt();
            }

            else
            {
                System.out.println("enter the no");
                a1[a-i+p-1]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++)
            System.out.println(a1[i]+"\t"+i);


    }
}