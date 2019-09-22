import java.util.*;
public class NumberWords
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                " Nineteen" };

        String ten[] = { " ", "Ten ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
        System.out.println("enter the no");
        int x=sc.nextInt();
        if(x>=0 && x<=9999)
        {
            if(x<=19)
                System.out.println(one[x]);
            else if(x<=99)
            {
                if(x%10==0)
                    System.out.println(ten[x/10]);
                else
                    System.out.println(ten[x/10]+" "+one[x%10]);
            }
            else if(x<=999)
            {
                int m=(x%100)/10;
                if(x%100==0)
                    System.out.println(one[x/100]+" Hundred");
                else if(x%100<=19)
                    System.out.println(one[x/100]+" Hundred "+one[x%100]);
                else if(x%10==0)
                    System.out.println(one[x/100]+" Hundred "+ten[m]);
                else
                    System.out.println(one[x/100]+" Hundred "+ten[m]+" " +one[x%10]);
            }
            else if(x<=9999)

            {
                int d=(x%1000)/100;
                int b=((x%1000)%100)/10;
                //int r=d*10+b;
                if(x%1000==0)
                    System.out.println(one[x/1000]+" Thousand"); 
                else if(x%1000<=999)
                //System.out.println(one[x/1000]+" Thousand "+one[(x%1000)/100]+"Hundred");
                    if(x%100<=19)
                        if(d==0)
                            System.out.println(one[x/1000]+" Thousand "+one[d]+one[(x%1000)%100]);
                        else
                            System.out.println(one[x/1000]+" Thousand "+one[d]+"Hundred"+one[(x%1000)%100]);
                    else if(x%10==0)
                        if(d==0)
                            System.out.println(one[x/1000]+"Thousand"+one[d]+ten[b]+one[x%10]);
                        else
                            System.out.println(one[x/1000]+"Thousand"+one[d]+"Hundred"+ten[b]+one[x%10]);
                    else
                    if(d==0)
                        System.out.println(one[x/1000]+"Thousand"+one[d]+ten[b]+one[x%10]);
                    else
                        System.out.println(one[x/1000]+"Thousand"+one[d]+"Hundred"+ten[b]+one[x%10]);

            }
        }
        else
            System.out.println("Out of range ");

    }
}