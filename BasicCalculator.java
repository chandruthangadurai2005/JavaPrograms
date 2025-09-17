/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAAWT;

/**
 *
 * @author student
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public BasicCalculator() {
        setTitle("Basic Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null); // center on screen
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        // Number 1 input
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Number 1:"), gbc);

        num1Field = new JTextField(10);
        gbc.gridx = 1;
        add(num1Field, gbc);

        // Number 2 input
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Number 2:"), gbc);

        num2Field = new JTextField(10);
        gbc.gridx = 1;
        add(num2Field, gbc);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        String[] ops = {"+", "-", "*", "/"};
        for (String op : ops) {
            JButton btn = new JButton(op);
            btn.addActionListener(this::operationClicked);
            buttonPanel.add(btn);
        }

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(buttonPanel, gbc);

        // Result label
        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridy = 3;
        add(resultLabel, gbc);
    }

    private void operationClicked(ActionEvent e) {
        String op = ((JButton) e.getSource()).getText();
        String text1 = num1Field.getText();
        String text2 = num2Field.getText();

        try {
            double n1 = Double.parseDouble(text1);
            double n2 = Double.parseDouble(text2);
            double res = 0;

            switch (op) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "*":
                    res = n1 * n2;
                    break;
                case "/":
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    res = n1 / n2;
                    break;
            }

            resultLabel.setText(String.format("Result: %.4f", res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BasicCalculator calc = new BasicCalculator();
            calc.setVisible(true);
        });
    }
}

