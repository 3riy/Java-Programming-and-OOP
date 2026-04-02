// -- JPanel -- //

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel_Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Component");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // -- JPanel -- //

        // JPanel panel_name = new JPanel() - Creates a JPanel component
        JPanel topPanel = new JPanel(); // Top Panel (Header)
        
        // panel_name.setBackground(Color.NAME) - Sets background color of panel
        topPanel.setBackground(Color.BLUE);

        JLabel title = new JLabel("TOP PANEL (Header)");

        title.setForeground(Color.WHITE);

        // panel_name.add(component_name) - Adds the specified component to the panel 
        topPanel.add(title);

        JPanel centerPanel = new JPanel(); // Center Panel (Content)
        centerPanel.setBackground(Color.GREEN);
        centerPanel.add(new JLabel("CENTER PANEL (Content Area)"));

        JPanel bottomPanel = new JPanel(); // Bottom Panel (Buttons)
        bottomPanel.setBackground(Color.RED);
        bottomPanel.add(new JButton("JButton"));

        // frame.add(panel_name)
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
