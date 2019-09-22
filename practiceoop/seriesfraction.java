
//1/1+1/(1+2)+1/(1+2+3)+....


import java.util.*;
class seriesfraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the terms");
        int n=sc.nextInt();
        double sum=0.0;
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            sum=sum+1.0/s;
        }
        System.out.println(sum+" ");
    }
}

