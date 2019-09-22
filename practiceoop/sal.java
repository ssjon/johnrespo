import java.util.*;
class sal extends employee
{
    private double as;
    private double hra,da,medical;
    public sal()
    {
        super();
        hra=0.0;
        da=0.0;
        medical=0.0;
        as=0.0;
    }
    public double calc()
    {
        hra=(getbasic()*10)/100;
        da=(getbasic()*12)/100;
        medical=(getbasic()*8)/100;
        as=hra+da-medical;
        return as;
    }
    void show()
    {
        super.show();
        System.out.println("\t"+as);
    }
    
}
          