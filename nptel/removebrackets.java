/*
 * /*
 * (a+b)+{h-u}*[o*p]
 * a+b+h-u*o*p
 */
 






import java.util.*;
class removebrackets
{
    private String x,y;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        x=sc.nextLine();
    }

    void check()
    {
        int l=x.length();

        y="";
        for(int i=0;i<l;i++)
        {
            char ch=x.charAt(i);
            if(ch=='(' || ch==')' || ch=='{' || ch=='}' || ch=='[' || ch==']')
                continue;
            else
                y=y+ch;

        }
        System.out.print(y);

    }
}

        