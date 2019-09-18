/*enter the string
1010100011
[1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 00, 00, 11, 101, 010, 101, 010, 000, 10101, 01010, 10001]*/


import java.util.*;
class pallindromevector
{
    public static void main(String args[])
    {
        //Vector v=new Vector();
        Scanner sc=new Scanner(System.in);
        ArrayList<String> v=new ArrayList<String>();
        int a=1;
        String str;
        System.out.println("enter the string");
        str=sc.next();

        int l=str.length();
        while(a<=l)
        {

            for(int i=0;i<str.length()-(a-1);i++)
            {
                String z=str.substring(i,i+a);
                if(z.length()>1)
                {
                    if(ispalin(z))
                        v.add(z);
                }
                else
                {

                    v.add(z);
                }
            }
            a++;
        }
        //for(int j=0;j<v.size();j++)
        System.out.println(v);
    }

    static boolean  ispalin(String n)
    {
        int l1=n.length();
        char ch;
        String s1="";
        for(int j=l1-1;j>=0;j--)
        {
            s1=s1+n.charAt(j);
            //s1+=Character.toString(ch);
        }
        if(n.equals(s1))
            return true;
        else
            return false;
    }

}

