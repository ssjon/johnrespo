import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;
public class ListExample12 extends Applet implements ItemListener
{ 
    TextField t1,t2;
    Choice op;
    Button b1;
    Label l;

    public  ListExample12()
    {
        t1=new TextField(20);
        t2=new TextField(20);
        op=new Choice();
        //b1=new Button("click me");
        //l=new Label();
        add(t1);
        add(t2);
        //add(b1);
        add(op);
        //add(l);
        op.addItem("select");
        op.addItem("reverse word");
        op.addItem("UpperCase");
        op.addItem("LowerCase");
        op.addItem("Togglecase");
        op.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e)
    {

        String s=t1.getText();
        if(e.getSource()==op)
        {
            if(op.getSelectedItem()=="UpperCase")
            {

                String s1=s.toUpperCase();
                t2.setText(" "+(s1));

            }

            else if(op.getSelectedItem()=="LowerCase")
            {
                String s1=s.toLowerCase();
                t2.setText(" "+(s1));
            }
            else if(op.getSelectedItem()=="reverse word")
            {

                String rev="";
                int l=s.length();
                for(int j=l-1;j>=0;j--)
                {
                    rev=rev+s.charAt(j);
                }
                t2.setText(rev);
            }
            else if(op.getSelectedItem()=="Togglecase")
            {
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
                t2.setText(s3);

            }
        }
    }

}
