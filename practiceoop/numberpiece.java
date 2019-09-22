import java.util.*;
class numberpiece
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        System.out.println("enter the digit per piece");
        int y=sc.nextInt();
        String a=Integer.toString(x);
        //String a1=Integer.toString(y);
        int l=a.length();

        for(int j=0;j<l;j+=y)
        {
                if(j+y<=l)
                {
                    String r=a.substring(j,j+y);
                    int k=Integer.parseInt(r);

                    if(k%3==0)
                        System.out.println(k);

                }
                else
                {
                    String r=a.substring(j);
                    int k=Integer.parseInt(r);

                    if(k%3==0)
                        System.out.println(k);
                    
            }
        }
    }
}