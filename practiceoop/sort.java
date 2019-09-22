import java.util.Arrays;
import java.util.Collections;
class sort
{
    private int i;
    void arrange(int a[])
    {
         
        for(int i=0;i<a.length;i++)
        {
           
            Arrays.sort(a);
           

        }
         System.out.println("now"+"\t"+Arrays.toString(a));
    }
}
