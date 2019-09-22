import java.util.*;
class sortmain
{
    public static void main(String args[])
    {
         sort st=new sort();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int n=sc.nextInt();
        int a3[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the nos");
            a3[i]=sc.nextInt();
        }
        st.arrange(a3);
    }
}
    