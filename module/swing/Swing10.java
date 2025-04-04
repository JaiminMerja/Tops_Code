package module.swing;

import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

// Adjustment Listener
class Tenth implements AdjustmentListener
{
    JFrame frame;
    JLabel h1,v1;
    JScrollBar h,v;
    
    public Tenth()
    {
        frame = new JFrame("Adjustment Listener");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        h=new JScrollBar(JScrollBar.HORIZONTAL, 1,5,0,100);
        v=new JScrollBar(JScrollBar.VERTICAL, 1,5,0,100);
        h1=new JLabel(" ");
        v1=new JLabel(" ");
        h.addAdjustmentListener(this);
        v.addAdjustmentListener(this);

        frame.add(h);
        frame.add(h1);
        frame.add(v);
        frame.add(v1);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) 
    {
        if(e.getSource()==h)
        {
            h1.setText("Horizontal:"+h.getValue());
        }
        if(e.getSource()==v)
        {
            v1.setText("Vertical:"+h.getValue());
        }
    }
}
public class Swing10 
{
    public static void main(String[] args) 
    {
        new Tenth();
    }
}
