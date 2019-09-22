import java.util.*;
class number
{
    private int a,b,c;
    public number()
    {
        a=100;
        b=200;
        c=300;
    }
    public number(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    public number(number n)
    {
        a=n.a;
        b=n.b;
        c=n.c;
    }
    public void avg()
    {
        double av=(a+b+c)/3.0;
        System.out.println("the average is"+av);
    }
}
    
    