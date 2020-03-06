
/*
 * "ab-cd"   input
 * "dc-ba"    output
 */

/*
 * "a-bc-def-ghij"   input
 * "j-ih-gfe-dcba"  output
 */
import java.util.*;
class reverseletter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[]chart=s.toCharArray();
        int l=s.length();

        for(int i=0,j=l-1;i<l;i++,j--)
        {
            boolean b1=Character.isLetter(s.charAt(i));
            boolean b2=Character.isLetter(s.charAt(j));
            if(b1==true && b2==true)
            {
                char ch=chart[i];
                chart[i++]=chart[j];
                chart[j--]=ch;
            }
            //System.out.println("yes");
        }
        String ar=new String(chart);
        System.out.println(ar);
    }
}