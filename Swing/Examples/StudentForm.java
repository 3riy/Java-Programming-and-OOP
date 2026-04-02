// -- Student Form using GridBagLayout for form fields to ensure proper alignment and JLabel for the header -- //

import java.awt.*;
import javax.swing.*;

public class StudentForm extends JFrame {
    public StudentForm() {
        setTitle("Student Form");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header
        JLabel header = new JLabel("STUDENT FORM", JLabel.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.ORANGE);
        header.setFont(new Font("Arial", Font.BOLD, 16));
        add(header, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Components
        addComponent(mainPanel, new JLabel("Name:"), new JTextField(15), gbc, 0);
        addComponent(mainPanel, new JLabel("Age:"), new JTextField(15), gbc, 1);

        // Gender (Radio Buttons)
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male); bg.add(female);
        genderPanel.add(male); genderPanel.add(female);
        addComponent(mainPanel, new JLabel("Gender:"), genderPanel, gbc, 2);

        // Course (Combo Box)
        String[] courses = {"MCA", "MBA", "MTech", "BCA"};
        addComponent(mainPanel, new JLabel("Course:"), new JComboBox<>(courses), gbc, 3);

        // Skills (Checkboxes)
        JPanel skillPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        skillPanel.add(new JCheckBox("Java"));
        skillPanel.add(new JCheckBox("Python"));
        addComponent(mainPanel, new JLabel("Skills:"), skillPanel, gbc, 4);

        // Address (Text Area)
        JTextArea address = new JTextArea(3, 15);
        addComponent(mainPanel, new JLabel("Address:"), new JScrollPane(address), gbc, 5);

        add(mainPanel, BorderLayout.CENTER);
        add(new JButton("Submit"), BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addComponent(JPanel p, JLabel lbl, Component comp, GridBagConstraints gbc, int row) {
        gbc.gridy = row; gbc.gridx = 0; p.add(lbl, gbc);
        gbc.gridx = 1; p.add(comp, gbc);
    }

    public static void main(String[] args) { new StudentForm(); }
}
