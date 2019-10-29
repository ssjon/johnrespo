import java.awt.*;
import java.util.*;
import java.applet.*;
import java.awt.event.*;
public class test5 extends Applet implements ActionListener
{
    Choice c1;
    test5()
    {

         c1 =new Choice();
    }

    public void init()
    {
        c1.setBounds(100,100,75,75);
        c1.add("php");
        c1.add("c#");
        c1.add("java");
        c1.add(".net");
    }

    public void actionPerformed(ActionEvent e)
    {
    }
}