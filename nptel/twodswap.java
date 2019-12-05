import java.util.*;
class twodswap
{
    public static void main(int r)
    {

        int a1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int b[]= new int[4];

        for(int i=0;i<3;i++)
        {
            if(i==r)
            {
                for(int j=0;j<4;j++)
                    b[j]=a1[i][j];
            }
        }

        for(int i=r;i<2;i++)
        {
            for(int j=0;j<4;j++)
                a1[i][j]=a1[i+1][j];
        }

        for(int j=0;j<4;j++)
        {
            int t=a1[0][j];
            a1[0][j]=a1[1][j];
            a1[1][j]=t;
        }

        for(int j=0;j<4;j++)
            a1[2][j]=b[j];
        System.out.println("after swap");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        }

    }
}