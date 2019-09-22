import java.util.*;
class scholarship extends sal
{
    private String grade;
    
    public scholarship()
    {
        super();
        grade="";
    }
    void find()
    {
        double b=calc();
        if(b>30000)
               
           grade="manager";
        
            else if(b>20000)
                  
                grade="engineer";
            
            else
                 grade="clerk";
                  
        }
        void show()
        {
            super.show();
            System.out.println("\t"+grade);
        }
    }
    