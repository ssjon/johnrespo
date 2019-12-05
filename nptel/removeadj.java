/*azxbbxzbyccad
azxxzbyccad
azzbyccad
abyad*/
              
              
import java.util.*;
class removeadj
{
    public static void main(String args[])
    {
        String s="azxbbxzbyccad";
        int f=0;
        while(f==0)
        {
            f=1;
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    f=0;
                    s=s.substring(0,i)+s.substring(i+2);
                }

            }
        }
        System.out.println(s);
    }
}
