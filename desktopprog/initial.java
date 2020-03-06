/*
 enter the string
suman kurmar chandra dey
s k c dey
 * 
 * 
 */

import java.util.*;
class initial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        String s2[];
        s2=s.split(" ");
        //System.out.print(Arrays.toString(s2));
        for(int i=0;i<s2.length;i++)
        {
            //System.out.println(s2[i]);
            int l=s2[i].length();
            String s3=s2[i];
            char ch=' ';
            if(i==s2.length-1)
            {
                System.out.print(s2[i]);
                break;
            }
            for(int j=0;j<l;j++)
            {
                if(j==0)
                ch=s3.charAt(j);
                
            }
            System.out.print(ch+" ");
            
        }
    }
}