// -- GridLayout Class -- //

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_Class {
    public static void main(String[] args) {
        JFrame f = new JFrame("Grid");

        // -- Grid -- //

        // f.setLayout(new GridLayout(rows, columns)) - Sets a grid-based layout
        // This divides the container into equal-sized rectangular cells
        f.setLayout(new GridLayout(2, 2));

        // f.add(component_name) - Adds buttons to the grid cells in order
        // Components are added from left-to-right, top-to-bottom
        f.add(new JButton("A")); // Row 1, Col 1
        f.add(new JButton("B")); // Row 1, Col 2
        f.add(new JButton("C")); // Row 2, Col 1
        f.add(new JButton("D")); // Row 2, Col 2

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Recommended for closing the app
        f.setVisible(true);
    }
}