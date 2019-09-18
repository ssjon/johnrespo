import java.util.*;
class arraypairswap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a1[]={7,8,1,2,3,4,5,6};
        int l=a1.length;
        int temp1=0,temp2=0,c=0;
        
        
        for(int i=0;i<l-2;i+=2)
        {
            for(int j=i+2;j<l-1;j+=2)
            {
                if(a1[i]>a1[j] & a1[i+1]>a1[j+1])
                {
                    temp1=a1[j];
                    a1[j]=a1[i];
                    a1[i]=temp1;
                    temp2=a1[i+1];
                    a1[i+1]=a1[j+1];
                    a1[j+1]=temp2;
                    c++;
                }
            }
        }

        for(int i=0;i<a1.length;i++)
            System.out.print(a1[i]);

    }
}