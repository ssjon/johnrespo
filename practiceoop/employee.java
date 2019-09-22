import java.util.*;
class employee
{
    private String name;
    private int id;
    private double bs;
    private int hra,da,medical;

    public employee()
    {
        name="";
        id=0;
        bs=0.0;
    }
      void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name ");
        name=sc.nextLine();
        System.out.print("enter id ");
        id=sc.nextInt();
        System.out.print("enter basic salary ");
        bs=sc.nextDouble();
    }
    public double getbasic()
    {
        return bs;
    }

    void show()
    {
        System.out.println(name+"\t"+id+"\t"+bs);
    }
}
