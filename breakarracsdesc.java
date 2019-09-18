/*enter the order
8
enter the no
9
4
5
3
2
1
8
7
12349875
 */
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class breakarracsdesc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        int m=x/2;
        int a1[]=new int[x];
        System.out.println("enter the no");
        for(int i=0;i<x;i++)
        {
            a1[i]=sc.nextInt();
        }
        Arrays.sort(a1);
        for(int i=0;i<x/2;i++)
        {

            System.out.print(a1[i]);
        }
            
        for(int j=x-1;j>=x/2;j--)
        {
            System.out.print(a1[j]);
            //break;
        }
    }
}

        