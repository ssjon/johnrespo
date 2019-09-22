import java.util.*;
class shapemain
{ 

    public static void main(String args[])
    {
        int c1=0;
        int ch=0;
        Scanner sc =new Scanner(System.in);
        do
        {
            System.out.println("1 for rectangle\n 2 for sqaure \n 3 for circle \n 4 for defult");
            System.out.println("enter the choice");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1: rec r =new rec();
                r.input();
                r.area();
                break;
                case 2: square s=new square();
                s.getdata();
                s.area();
                break;

                case 3: circle c=new circle();
                c.getvalue();
                c.area();
                break;

                case 4: System.out.println("do u want to continue? don't prees 0 if u want to continue");
                ch=sc.nextInt();
                //break;
            }
        } 
        while (ch!=0);

    }
}

