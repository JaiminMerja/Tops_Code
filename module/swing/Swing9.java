package module.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Ninth implements ActionListener
{
    JFrame frame;
    JLabel l1, msg;
    JTextField t1;
    JButton b1;

    public Ninth()
    {
        frame = new JFrame("Action Event");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter Your Name:");
        msg = new JLabel(" ");
        t1 = new JTextField(15);
        b1 = new JButton("Display");
        b1.addActionListener(this);
        
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        frame.add(msg); 
    }
    @Override
    // public void actionPerformed(ActionEvent e)
    // {
    //     if(e.getSource()==b1)
    //     {
    //         msg.setText(t1.getText());
    //     }
    //     if(e.getActionCommand().equalsIgnoreCase("Display"));
    //     {
    //         msg.setText(t1.getText());
    //     }
    // }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String lastText = msg.getText();
            String newText = t1.getText();

            if(!newText.isEmpty())
            {
                msg.setText(lastText + " " +newText);
            }
        }
    }
}
public class Swing9 
{
    public static void main(String[] args) 
    {
        new Ninth();
    }
}
