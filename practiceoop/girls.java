import java.util.*;
 class girls extends student
{
    //override
    public void exam()
    {
        System.out.println("marks");
    }
    public static void main(String args[]){
    	student obj = new girls();
    	obj.exam();
    }
}
    