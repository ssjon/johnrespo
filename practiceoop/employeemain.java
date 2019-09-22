import java.util.*;
class employeemain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of employee");
        int r=sc.nextInt();
        scholarship sh[]=new scholarship[r];
        for(int i=0;i<r;i++)
            sh[i]=new scholarship();
        for(int i=0;i<r;i++)
            sh[i].accept();
        for(int i=0;i<r;i++)
            sh[i].find();
        for(int i=0;i<r;i++)
            sh[i].show();

    }
}