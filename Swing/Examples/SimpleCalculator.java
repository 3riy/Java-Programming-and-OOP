// -- Simple Calculator using JTextField for the display and a JPanel with a 4x4 GridLayout to organize the buttons. -- //

import java.awt.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator = "";
    private double firstNum = 0;
    private boolean startNewNumber = true;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (Character.isDigit(cmd.charAt(0))) {
            if (startNewNumber) {
                display.setText(cmd);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + cmd);
            }
        } else if (cmd.equals("C")) {
            display.setText("0");
            operator = "";
            startNewNumber = true;
        } else if (cmd.equals("=")) {
            calculate(Double.parseDouble(display.getText()));
            operator = "";
            startNewNumber = true;
        } else {
            firstNum = Double.parseDouble(display.getText());
            operator = cmd;
            startNewNumber = true;
        }
    }

    private void calculate(double secondNum) {
        switch (operator) {
            case "+": display.setText(String.valueOf(firstNum + secondNum)); break;
            case "-": display.setText(String.valueOf(firstNum - secondNum)); break;
            case "*": display.setText(String.valueOf(firstNum * secondNum)); break;
            case "/": display.setText(String.valueOf(firstNum / secondNum)); break;
        }
    }

    public static void main(String[] args) { new SimpleCalculator(); }
}
