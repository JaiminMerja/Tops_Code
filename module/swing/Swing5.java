package module.swing;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//Flow Layout
class Fifth {
    JFrame frame;
    JMenuBar bar;
    JMenu file, edit;
    JMenuItem New, open, save, cut, copy, paste;

    public Fifth() {
        frame = new JFrame("Fifth Demo");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        New = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        file = new JMenu("File");
        edit = new JMenu("Edit");

        file.add(New);
        file.add(open);
        file.add(save);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        bar = new JMenuBar();
        bar.add(file);
        bar.add(edit);

        frame.add(bar);

    }
}

public class Swing5 {
    public static void main(String[] args) {
        new Fifth();
    }
}
