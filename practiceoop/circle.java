import java.util.*;
public class circle extends shape
{
    private int r;
    
    void getvalue()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radious");
        r=sc.nextInt();
    }
    void area()
    {
        Double pi=3.14;
        ar=pi*r*r;
        System.out.println("area of circle"+ar);
    }
}

        