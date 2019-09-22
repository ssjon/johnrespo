import java.util.*;
class Triplet
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int count=0;
        System.out.print("Enter the order of the matrix ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int s=sc.nextInt();

        int a[]= new int[p];
        int b[]= new int[q];
        int c[]= new int[s];

        for(int i=0;i<p;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<q;i++)
            b[i]=sc.nextInt();

        for(int i=0;i<s;i++)
            c[i]=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                for(int k=0;k<c.length;k++)
                {
                    if(a[i]<=b[j] && b[j]>=c[k])
                        
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}