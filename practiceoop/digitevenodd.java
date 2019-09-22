import java.util.*;
class digitevenodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int x=sc.nextInt();
        int c=0,k=0;
        while(x!=0)
        {
            int d=x%10;
            if(d%2==0)
            {
                c++;
                
            }
            else
            {
                k++;
                
            }
            x=x/10;
        }
        System.out.println("no of even number is"+c);
        System.out.println("no of odd number is"+k);
    }
}
 