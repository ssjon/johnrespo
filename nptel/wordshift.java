/*
 * hello kolkata
jgnnq"mqnmcvc
 * 
*/


import java.util.*;
class wordshift
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        String r="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            int v=(int) ch;
            v+=2;
            r=r+(char)v;
            
        }
        System.out.println(r);
    }
}