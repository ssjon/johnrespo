import java.awt.*;
import java.applet.*;
public class testapplet2 extends Applet
{
    TextField name,title;
    Label l1,l2;
    
    public void init()
    {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new Label("NAME      :"));
        add(new TextField(10));

        add(new Label("Address       :"));
        add(new TextField(10));

        add(new Label("Gender        :"));
        Choice gender = new Choice(); 
        gender.addItem("Man"); 
        gender.addItem("Woman"); 
        Component add = add(gender);

    }

}