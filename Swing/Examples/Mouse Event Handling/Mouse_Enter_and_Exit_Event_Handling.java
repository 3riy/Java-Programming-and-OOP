// -- Mouse enter and exit event handling -- //

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Mouse_Enter_and_Exit_Event_Handling { 
    public static void main(String[] args) { 
        JFrame f = new JFrame("Mouse Enter Exit"); 
        f.addMouseListener(new MouseAdapter() { 
            public void mouseEntered(MouseEvent e) { 
                f.getContentPane().setBackground(Color.GREEN); 
            } 
            public void mouseExited(MouseEvent e) { 
                f.getContentPane().setBackground(Color.RED); 
            } 
        }); 
        f.setSize(400, 300); 
        f.setLayout(null); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}
