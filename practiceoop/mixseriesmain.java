//2a4b6c....



import java.util.*;
class mixseriesmain
{
    public static void main(String rgs[])
    {
        //mixseries mx=new mixseries();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of terms");
        int n=sc.nextInt();
        int t=2,a=65;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                System.out.print(t);
                t=t+2;
            }
            else
            {
                System.out.print((char)a);
                a++;

            }
        }
    }
}