import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class CharCounter extends JFrame {
    JTextField ta;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JButton b;

    CharCounter() {
        setTitle("Character Counter");
        l1 = new JLabel("Enter Text");

        ta = new JTextField(5);
        // ta.setBounds(100, 100, 400, 400);
        // b.setBounds(270, 500, 60, 40);
        // l1.setBounds(100, 50, 100, 30);
        l2 = new JLabel("Character Count:");
        l3 = new JLabel("0");
        // l2.setBounds(250, 50, 100, 30);
        add(l1);
        add(ta);
        add(l2);
        add(l3);
        setLayout(new FlowLayout());
        setSize(295, 135);
        setVisible(true);

        ta.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                int c = ta.getText().length();
                l3.setText("" + c); // auto typecast
            }

            @Override
            public void insertUpdate(DocumentEvent arg0) {
                int c = ta.getText().length();
                l3.setText("" + c); // auto typecast

            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                int c = ta.getText().length();
                l3.setText("" + c); // auto typecast

            }
        });
    }

    public static void main(String[] args) {
        new CharCounter();
    }
}