import java.util.*;
class spword
{
    boolean spl()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String a=sc.next();
        int l=a.length();
        char f=a.charAt(0);
        char la=a.charAt(l-1);
        if(f==la)
            return true;
        else
            return false;

    }
}


