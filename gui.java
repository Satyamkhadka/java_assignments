
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Gui implements ActionListener {
    JLabel label;
    int number = 1;
    int increment = 1;

    Gui() {
        // Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Creating the panel at bottom and adding components
        JPanel panel = new JPanel();
        JButton show = new JButton("Show Results");
        this.label = new JLabel("Click the button");
        // Components Added using Flow Layout
        panel.add(show);
        panel.add(label);

        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);

        // register listener
        show.addActionListener(this);// passing current instance

    }

    public void actionPerformed(ActionEvent e) {
        if (increment < 11) {

            label.setText(number + " "); // auto type cast
            number += increment;
            increment++;
        } else {
            label.setText("shown up to tenth term.");

        }
    }

    public static void main(String args[]) {
        Gui g = new Gui();
    }

}
