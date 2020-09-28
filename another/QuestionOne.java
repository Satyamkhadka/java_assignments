import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuestionOne {
    public static void main(String[] args) {
        JFrame f = new JFrame("GUI Program");
        JButton b = new JButton("Show Results");
        JLabel l = new JLabel("Show Your Results Here");

        // varibales
        boolean x = true;
        boolean y = false;
        boolean z = x & y;

        f.add(b);
        f.add(l);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText(Boolean.toString(z));
            }
        });
    }

}