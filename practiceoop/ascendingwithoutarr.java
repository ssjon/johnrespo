import java.util.*;
class ascendingwithoutarr
{
    public static void main(String[] args)
    {
        //string x1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nos");
        int x=sc.nextInt();
        int r=0;
        for(int i=1;i<=9;i++)
        {
            int num=x;
            while(num!=0)
            {
                int d=num%10;
                if(d==i)
                 r=r*10+d;
                 
                num=num/10;
            }
        }
        System.out.print(r);
    }
}