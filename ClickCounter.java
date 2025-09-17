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

public class ClickCounter extends JFrame {
    private int count = 0;
    private JLabel countLabel;

    public ClickCounter() {
        setTitle("Click Counter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        countLabel = new JLabel("Count: 0");
        JButton incrementBtn = new JButton("Click Me");
        JButton resetBtn = new JButton("Reset");

        incrementBtn.addActionListener(e -> {
            count++;
            countLabel.setText("Count: " + count);
        });

        resetBtn.addActionListener(e -> {
            count = 0;
            countLabel.setText("Count: " + count);
        });

        add(countLabel);
        add(incrementBtn);
        add(resetBtn);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClickCounter().setVisible(true);
        });
    }
}
