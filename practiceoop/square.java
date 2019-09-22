import java.util.*;
class square extends shape
{
    private int s;
    void getdata()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the side");
        s=sc.nextInt();
    }
    void area()
    {
        ar=s*s;
        System.out.println("Area="+ar);
    }
}