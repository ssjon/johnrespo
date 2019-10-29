import java.awt.*;  
import java.awt.event.*;  
public class ListExample  
{  
    ListExample(){  
        Frame f= new Frame();  
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(500,100);  
        Button b=new Button("Show");  
        b.setBounds(200,150,80,30);  
        final List l1=new List(4, false);  
        l1.setBounds(100,100, 70,70);  
        l1.add("C");  
        l1.add("C++");  
        l1.add("Java");  
        l1.add("PHP");  
        final List l2=new List(4, true);  
        l2.setBounds(100,200, 70,70);  
       
        b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                    String data = "you select "+l1.getItem(l1.getSelectedIndex());  
                    
                    label.setText(data);  
                }  
            });          
    }  

    public static void main(String args[])  
    {  
        new ListExample();  
    }  
}  
