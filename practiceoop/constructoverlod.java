import java.util.*;
class constructoverlod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        
        number n1=new number();
        number n2=new number(x,y,z);
        number n3=new number(n2);
        
        n1.avg();
        n2.avg();
        n3.avg();
    }
}