import java.util.*;
class bigsorting
{

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        String a1[]=new String[x];
        System.out.println("enter the nos");
        for(int i=0;i<x;i++)
        {
            a1[i]=sc.next();
        }
        for(int i=1;i<x;i++)
        {
            String temp=a1[i];

            int j=i-1;
            while(j>=0 &&temp.length()<a1[j].length())
            {
                a1[j+1]=a1[j];
                j--;
            }
            a1[j+1]=temp;

           
        }
         System.out.println(Arrays.toString(a1));
    }
}
 