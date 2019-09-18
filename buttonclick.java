import java.awt.*;
import java.util.*;
import java.applet.*;
import java.awt.event.*;
public class buttonclick extends Applet implements ActionListener
{
    TextField T1,T2,T3,T4,T5,T6;
    Label l1,l2,l3,l4,l5,l6;
    Button b1,b2,b3,b4,b5;
    String s1,s,s2,s3,s4;
    public void init()
    {
        T1=new TextField(20);
        T2=new TextField(20);
        T3=new TextField(20);
        T4=new TextField(20);
        T5=new TextField(20);
        T6=new TextField(20);
        l1=new Label("ENTER THE STRING");
        l2=new Label("UPPER CASE");
        l3=new Label("LOWER CASE");
        l4=new Label("TOGGLE CASE");
        l5=new Label("REVERSE CASE");
        l6=new Label("special case");
        b1=new Button("UPPER CASE");
        b2=new Button("LOWER CASE");
        b3=new Button("TOGGLE CASE");
        b4=new Button("REVERSE CASE");
        b5=new Button("SPECIAL CASE");
        add(l1);
        add(T1);
        add(l2);
        add(T2);
        add(l3);
        add(T3);
        add(l4);
        add(T4);
        add(l5);
        add(T5);
        add(l6);
        add(T6);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    /*public void paint(Graphics g)
    {
    String s=T1.getText();
    String s1=T2.getText();

    T2.setText(s1);
    String s2=s.toLowerCase();
    T3.setText(s2);
    int l=s.length();
    String s3="";
    s=s+" ";
    for(int i=0;i<s.length();i++)
    {
    char ch=s.charAt(i);
    if(ch>='a' && ch<='z')
    s3+=Character.toUpperCase(ch);
    else if(ch>='A' && ch<='Z')
    s3+=Character.toLowerCase(ch);
    else
    s3+=ch;
    }
    T4.setText(s3);
    String rev="";
    for(int j=l-1;j>=0;j--)
    {
    rev=rev+s.charAt(j);
    }
    T5.setText(rev);
    String uc="";
    Scanner lineScan= new Scanner(s);
    while(lineScan.hasNext())
    {
    String w=lineScan.next();
    uc+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
    }
    //System.out.println(uc);
    T6.setText(uc);

    }*/

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String s=T1.getText();
            s1=s.toUpperCase();
            T2.setText(" "+(s1));
        }
        if(e.getSource()==b2)
        {
            String s=T1.getText();
            s2=s.toLowerCase();
            T3.setText(" "+(s2));
        }
        if(e.getSource()==b3)
        {
            String s=T1.getText();
            int l=s.length();
            s3="";
            s=s+" ";
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch>='a' && ch<='z')
                    s3+=Character.toUpperCase(ch);
                else if(ch>='A' && ch<='Z')
                    s3+=Character.toLowerCase(ch);
                else
                    s3+=ch;
            }
            T4.setText(s3);

        }
        if(e.getSource()==b4)
        {
            String s=T1.getText();
            String rev="";
            int l=s.length();
            for(int j=l-1;j>=0;j--)
            {
                rev=rev+s.charAt(j);
            }
            T5.setText(rev);
        }
        if(e.getSource()==b5)
        {
            String s=T1.getText();
            String uc="";
            Scanner lineScan= new Scanner(s);
            while(lineScan.hasNext())
            {
                String w=lineScan.next();
                uc+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
            }
            //System.out.println(uc);
            T6.setText(uc);

        }

        //g.drawString("String program",150,150);
        /*public boolean action(Event e,Object o)
        {
        repaint();
        return true;
        }*/
        
        
    }
}

