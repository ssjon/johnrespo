import java.util.*;
class dynamicarr
{
    int n,i,x;
    String p,p1;
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no of array");
        n=sc.nextInt();
    }

    void op()
    {
        Scanner sc=new Scanner (System.in);
        ArrayList<String> no=new ArrayList<String>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the array name & size");
            p=sc.next();
            x=sc.nextInt();
            p1=Integer.toString(x);
            no.add(p);
            no.add(p1);
        }
        Iterator itr=no.iterator();
        while(itr.hasNext());
        {
            System.out.println(itr.next());
        }
    }
}

        