import java.util.*;
class reversewithoutfun
{
    void rev()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String str=sc.next();
        String rev="";
        for(int j=str.length()-1;j>=0;j--)
        {
            rev= rev+ str.charAt(j);

        }
        int f=0;
        for(int i=0;i<str.length();i++)
        {
            char c1=str.charAt(i);
            char c2=rev.charAt(i);
            if(c1!=c2)
            {
                f=1;
                break;
            }
        }

        if(f==0)
        {
            System.out.print("pallin");
        }
        else
        {
            System.out.print("not pallin");

        }
    }
}

