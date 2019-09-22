import java.util.*;
class increasingarr
{
    private int x,y;
    private int a1[],a2[];
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the order");
        x=sc.nextInt();
        a1=new int[x];
    }

    void fill()
    {
        Scanner sc=new Scanner (System.in);
        
        for(int i=0;i<a1.length;i++)
        {
            System.out.println("enter the nos"+i);
            a1[i]=sc.nextInt();
        }
    }

    void print()
    {
        System.out.println("original array");
        
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
    }

    void op()
    {

        Scanner sc=new Scanner (System.in);
        System.out.println("enter the new size");
        y=sc.nextInt();
        int[]a2 = Arrays.copyOf(a1,y);
        for(int i=x;i<y;i++)
        {
            System.out.println("enter the nos"+i);
            a2[i]=sc.nextInt();
        }

        //a2[5]=78;
        //a2[6]=90;
        System.out.println("modified array");
        for(int i=0;i<a2.length;i++)
        {
            System.out.println(a2[i]);

        }
        /*void show()
        {
        System.out.println("new array");
        // for(int i=0; i<a2.length; i++)

        }
        }*/
    }
}
