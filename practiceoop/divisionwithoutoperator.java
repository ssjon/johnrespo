import java.util.*;
class divisionwithoutoperator
{
    static int q;
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int divisor=Math.abs(b);
        int dividend=Math.abs(a);

        while(dividend>=divisor)
        {
            dividend-=divisor;
            ++q;
            if(dividend<divisor)
            {
                System.out.println(dividend);

            }

            //System.out.println(divisor);

        }
        System.out.println(q);
    }
}