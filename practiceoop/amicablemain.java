import java.util.*;
class amicablemain
{
    public static void main(String args[])
    {
        amicableno am=new amicableno();
        //Scanner sc=new Scanner (System.in);
        //System.out.println("enter the two number");
        //int x=sc.nextInt();
        //int y=sc.nextInt();
        int i=10;
        /*if(am.ami(x)==y)
        {
            System.out.print("amicable");

        }
        else
        {
            System.out.print("not amicable");
        }*/
        while(i<100)
        {
            for(int j=i+1;j<=100;j++)
            {
                if(am.ami(i)==j)
                {
                    System.out.print(i+" " +j+" ");
                    
                }
            }
            
            i++;
            
        }
    }
}

