/*
matrix
0 1 1 2  
3 5 8 13  
21 34 55 89  
144 233 377 610  


*/









import java.util.*;
class matrfibo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a1[][]=new int[4][4];
        int a=0,b=1;
        System.out.println("matrix");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                //a1[i][j]=fibo();
                
                
                int c=a+b;
                //System.out.println(a);
                a1[i][j]=a;
                a=b;
                b=c;

            }
        }
        for(int i=0;i<4;i++)
        {

            for(int j=0;j<4;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println(" ");
        }

    }

    /*public static int fibo()
    {
    int a=0,b=1;
    for(int k=0;k<16;k++)
    {

    int c=a+b;
    //System.out.println(a);
    a=b;
    b=c;
    }
    return a;
    }*/
}
