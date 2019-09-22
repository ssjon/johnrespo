import java.util.*;
class bubblesort
{
    private int b1[],n,f,k=0;
    private int sum,c;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        n=sc.nextInt();
        b1=new int [n];
    }

    void fill()
    {
        Scanner sc=new Scanner(System.in);
        //System.out.print("enter the no");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the no");
            b1[i]=sc.nextInt();
        }
    }

    void bubble()
    {
        sum=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=1;j<n-i;j++)
            {
                if(b1[j-1]>b1[j])
                {
                    int temp=b1[j-1];
                    b1[j-1]=b1[j];
                    b1[j]=temp;
                    c++;
                }
            }
            sum+=c;
        }
    }

    void print()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(b1[i]+" ");
        }
        System.out.println(sum);
    }
}

