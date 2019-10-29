import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class operationusingcheckbox extends Applet implements ActionListener
{
    TextField t1,t2,t3;
    Checkbox cb1,cb2;
    Button b1,b2;
    public void init()
    {
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        b1=new Button("OPERATION");
        //b2=new Button("Subtraction");
        cb1=new Checkbox("ADDITION");
        cb2=new Checkbox("SUBTRACTION");
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        //add(b2);
        add(cb1);
        add(cb2);
        b1.addActionListener(this);
        //b2.addActionListener(this);
        //cb1.addItemListener(this);
        //cb2.addItemListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1 && cb1.getState()==true)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(" "+(n1+n2));            
        }
        if(e.getSource()==b1 && cb2.getState()==true)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(" "+(n1-n2));            
        }
    }

    /*public void itemStateChanged(ItemEvent e)
    {
    if(e.getSource()==cb1)
    {


    }
    }*/
}
