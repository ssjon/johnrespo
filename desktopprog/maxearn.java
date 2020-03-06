/*
  8
11
2
6
 * 
 */




import java.util.*;
class maxearn
{
    public static void main(String rags[])
    {
        int e1[]={8,2,3,11,11,10};
        //int e1[]={12,20,39,45,89};
        int l1=e1.length;
        int c=1, s=0;
        int er=3;
        
        for(int i=0;i<e1.length;)
        {
            int k=e1[i];
            System.out.println(e1[i]);
            for(int j=i+1;j<e1.length;j++)
            {
                if(k>e1[j])
                    c++;
                else
                    break;
                    

            }
            i+=c;
            s++;
        }
        System.out.println(s);
        System.out.println(er*s);
    }
}
/*else if(x==e1[j])
c-=1;*/