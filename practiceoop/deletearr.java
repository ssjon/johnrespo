import java.util.*;
class deletearr
{
    public static void main(String args[])
    {
        int ar[]=new int[8];

        Scanner sc=new Scanner(System.in);
        int n=8;
        System.out.print("enter the nos");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                }
            }
            int num=ar[i];
            if(count>1)
            {
                for(int x=0;x<n;x++)
                {
                    if(ar[x]==num)
                    {
                        for(int y=x;y<n-1;y++)
                            ar[y]=ar[y+1];
                        n--;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

}
