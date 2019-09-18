/*
 * enter theorder
6
8
4
1
2
3
9
15
 */


import java.util.*;
class sumgap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter theorder");
        int x=sc.nextInt();
        int s1[]=new int[x];
        for(int i=0;i<x;i++)
            s1[i]=sc.nextInt();
        int s2=0,s3=0;

        for(int i=0;i<=s1.length-1;i+=2)
        {
            s2+=s1[i];
        }
        for(int j=1;j<s1.length;j+=2)
        {
            s3+=s1[j];
        }

        if(s2>s3)
            System.out.println(s2);
        else
            System.out.println(s3);
        //System.out.println(s2);
        //System.out.println(s3);
    }
}

        