import java.awt.*;
import java.applet.*;
public class Testapplet extends Applet
{
    TextField T1,T2;
    TextArea T3;
    int c=0;
    String p,q;
    public void init()
    {
        T1=new TextField(10);
        T2= new TextField(10);
        T3=new TextArea();
        add(T1);
        add(T2);
        add(T3);
    }

    boolean prime(int a)
    {
        for(int j=1;j<=a;j++)
        {
            if(a%j==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    int k;
    public void paint(Graphics g)
    {
        int a=Integer.parseInt(T1.getText());
        int b=Integer.parseInt(T2.getText());
        String str="";

        for(int i=a;i<=b;i++)
        {
            int copy=i;
            int r=0,e=0,f=0;
            while(copy!=0)
            {
                int d=copy%10;
                r=r*10+d;
                copy=copy/10;
            }
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    e++;
            }
            for(int j=1;j<=r;j++)
            {
                if(r%j==0)
                    f++;
            }
            if(e==2 && f==2)
            {
                str=str+i+" ";
                // str+=Integer.toString(r);
            }
        }
        g.drawString(str,100,200);
        T3.setText(str);
    }

    /* if(i%2!=0)
    {
    str+=Integer.toString(i)+" ";

    }*/
    /*int copy=i;
    int s=0;
    while(copy!=0)
    {
    int d=copy%10;
    s= s*10+d;
    copy=copy/10;
    }

    if(s==i)
    str+=Integer.toString(s)+" ";
    T3.setText(str);
    }
    }*/

    public boolean action(Event e,Object o)
    {
        repaint();
        return true;
    }

}

