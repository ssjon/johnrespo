import java.util.*;
class nonfibomain
{
    public static void main(String args[])
    {
        nonfibo nf=new nonfibo();
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the limit");
        int a=sc.nextInt();
        for(int i=0;i<=a;i++)
        {
            if(nf.fibo(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}