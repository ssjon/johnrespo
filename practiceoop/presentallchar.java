import java.util.*;
class presentallchar
{
    private String sentence;
    // private String 
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        sentence=sc.nextLine();
    }

    void check()
    {
        sentence=sentence.toUpperCase();
        int length=sentence.length();
        int flag=0;
        for(int a=65;a<=90;a++)// ASCII value
        {
            int f=0;
            for(int i=0;i<sentence.length();i++)//check ech character with corresponding char
            {
                char ch=sentence.charAt(i);
                if(ch==(char)a)//checking
                    f++;
            }
            if(f==0)
            {
                flag=1;
                break;
            }
        }
          if(flag==1)
            System.out.println("invalid sentence");
        else 
            System.out.println("valid sentence");

    }
}

        