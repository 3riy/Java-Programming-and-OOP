// -- JLabel -- //

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel_Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Component");

        // -- JLabel -- //

        // JLabel label_name = new JLabel("JLabel") - Creates a JLabel component
        JLabel label = new JLabel("JLabel");

        // label.setBounds(x, y, width , height) - Set boundaries/padding
        label.setBounds(100, 100, 200, 30);

        // label.setFont(new Font("Name", Font.STYLE, size)) - Sets label font styles
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // label.setForegroundColor(Color.NAME) - Sets label foreground color
        label.setForeground(Color.BLUE);

        // frame.add(label) - Adds JLabel inside JFrame
        frame.add(label);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
