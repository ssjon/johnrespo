import java.util.*;
class Gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two nos");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int h=0,l=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0 && y%i==0)
                h=i;
        }
        l=(x*y)/h;
        System.out.println("H.C.F value "+h);
        System.out.println("L.C.M value "+l);
    }
}
 