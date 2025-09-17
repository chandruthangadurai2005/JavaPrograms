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
import java.io.File;

public class ImageLoader extends JFrame {
    private JLabel imageLabel;

    public ImageLoader() {
        setTitle("Image Loader");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JButton browseButton = new JButton("Browse");
        imageLabel = new JLabel("", SwingConstants.CENTER);

        browseButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
                Image img = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(img));
            }
        });

        add(browseButton, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ImageLoader().setVisible(true);
        });
    }
}
