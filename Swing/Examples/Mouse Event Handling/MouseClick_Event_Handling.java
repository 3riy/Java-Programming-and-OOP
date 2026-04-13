// -- Mouse click event handling -- //

import javax.swing.*;
import java.awt.event.*;

public class MouseClick_Event_Handling { 
    public static void main(String[] args) { 
        JFrame f = new JFrame("Mouse Event Demo"); 
        JLabel l = new JLabel("Click anywhere"); 
        l.setBounds(100, 100, 200, 30); 
        f.add(l); 
        f.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
                l.setText("Clicked at: " + e.getX() + "," + e.getY()); 
            } 
        }); 
        f.setSize(400, 300); 
        f.setLayout(null); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}
