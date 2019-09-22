import java.util.*;
class chararr
{
    private int a2[],a,p;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        a=sc.nextInt();
        System.out.println("enter the pos to break the array");
        p=sc.nextInt();
        a2=new int[a];
    }

    void fill()
    {
        for(int i=0;i<a;i++)
        {
            if(i<p)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the no");
                a2[i]=sc.nextInt();
            }
            else
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the char");
                char k=sc.next(".").charAt(0);
                a2[i]=(int)k;
            }
        }
        for(int i=0;i<a;i++)
            System.out.println(a2[i]);
    }
}
