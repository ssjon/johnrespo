import java.util.*;
class numtoword
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc =new Scanner(System.in);
        String w[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("enter the no");
        String  x=sc.next();
        int l=x.length();
        for(int j=0;j<x.length();j++)
        {
            for(char i='0';i<='9';i++)
            {
                char a=x.charAt(j);
                //System.out.println(a);
                if(i==a)
                    c=Integer.parseInt(String.valueOf(a));

            }
            for(int k=0;k<=9;k++)
            {
                if(k==c)
                    System.out.println(w[k]);
            }
        }

    }
}

