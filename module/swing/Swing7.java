package module.swing;

//Grid Demo

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Seventh
{
    JFrame frame;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;

    public Seventh()
    {
        frame = new JFrame("Grid Demo");
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Enter UserName:");
        l2=new JLabel("Enter Password:");
        t1=new JTextField(15);
        p1=new JPasswordField(15);
        b1=new JButton("Login");
        b2=new JButton("Cancle");
        
        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(p1);
        frame.add(b1);
        frame.add(b2);
    }
}
public class Swing7 
{
    public static void main(String[] args) 
    {
        new Seventh();
    }
}
