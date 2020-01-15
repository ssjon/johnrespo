/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/
 * enter the order
6
-3
2
3
-4
3
1
output
2
1
2
0
3
1
 */








import java .util.*;
class bestindex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        int b[]=new int[x];
        int sum=0;
        for(int l=0;l<x;l++)
        {
            b[l]=sc.nextInt();    //-3 2 3 -4 3 1
        }
        for(int i=0;i<x;i++)
        {
            int s=0;
            int k=1,j=i;
            while((j+k)<=x)
            {
                for(int n=j;n<(j+k);n++)
                {
                    s=s+b[n];
                }
                j=j+k;
                k++;
            }
            System.out.println(s);
        }
    }

}