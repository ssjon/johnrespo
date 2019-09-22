//1/2+1/3+1/5+1/7+1/11+1/13.....


import java. util.*;
class serieswipro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of terms");
        int x=sc.nextInt(); 
        int c=1;
        double s=0.0;
        for(int n=1;c<=x;n++)
        {
            int f=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    f++;

            }
            if(f==2)
            {
                System.out.println(n);
                c++;
                s=s+1.0/n;
            }
        }
        System.out.println("Sum of the series "+s);
    }
}

