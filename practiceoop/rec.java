import java.util.*;
class rec extends shape
{
    private int l;
    private int b;
    public void input()
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter length & breath");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    void area()
    {
        ar=l*b;
        
        System.out.println("area of a rectangle"+ar);
    }
}