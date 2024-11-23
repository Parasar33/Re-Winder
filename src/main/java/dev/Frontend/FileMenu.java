package dev.Frontend;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

public class FileMenu {
    private JPanel panel;
    private JTextField pathField;

    // Declare Image icons at the start
    private Image recordIcon;
    private Image playMovieIcon;
    private Image optionsIcon;

    public FileMenu() {
        initialize();
    }

    private void initialize() {
        // Initialize images
        ClassLoader classLoader = getClass().getClassLoader();
        recordIcon = loadImage(classLoader.getResource("fileMenu/icon.png"));
        playMovieIcon = loadImage(classLoader.getResource("fileMenu/Video_Camera.png"));
        optionsIcon = loadImage(classLoader.getResource("fileMenu/icon.png"));

        // Initialize panel
        panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        panel.setBounds(0, 0, 450, 300);

        // Record Section
        JButton recordBtn = new JButton();
        // Scale the image to fit the button
        recordBtn.setBackground(new Color(0, 0, 0, 0));
        recordBtn.setOpaque(false);
        recordBtn.setIcon(new ImageIcon(scaleImage(recordIcon, 70, 70)));
        recordBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        recordBtn.setBounds(10, 5, 70, 70);
        panel.add(recordBtn);

        // Path and Interval fields
        JLabel pathLabel = new JLabel("Path");
        pathLabel.setBounds(90, 10, 30, 20);
        panel.add(pathLabel);

        pathField = new JTextField("C:/RISHAV/Downloads/Snapshots");
        pathField.setBounds(90, 30, 280, 20);
        panel.add(pathField);

        JButton browseBtn = new JButton();
        browseBtn.setBounds(380, 30, 30, 20);
        panel.add(browseBtn);

        JLabel intervalLabel = new JLabel("Interval");
        intervalLabel.setBounds(90, 55, 40, 20);
        panel.add(intervalLabel);

        JTextField intervalField = new JTextField("5");
        intervalField.setBounds(140, 55, 30, 20);
        panel.add(intervalField);

        JLabel secondsLabel = new JLabel("(s)");
        secondsLabel.setBounds(175, 55, 20, 20);
        panel.add(secondsLabel);

        // Play Movie Section
        JButton playMovieBtn = new JButton();
        // Scale the image to fit the button
        playMovieBtn.setBackground(new Color(0, 0, 0, 0));
        playMovieBtn.setOpaque(false);
        playMovieBtn.setIcon(new ImageIcon(scaleImage(playMovieIcon, 64, 64)));
        playMovieBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        playMovieBtn.setBounds(10, 85, 70, 70);
        panel.add(playMovieBtn);

        JLabel playLabel = new JLabel("Play your day, just like a movie!");
        playLabel.setBounds(90, 110, 200, 20);
        panel.add(playLabel);

        // Options Section
        JButton optionsBtn = new JButton();
        // Scale the image to fit the button
        optionsBtn.setBackground(new Color(0, 0, 0, 0));
        optionsBtn.setOpaque(false);
        optionsBtn.setIcon(new ImageIcon(scaleImage(optionsIcon, 70, 70)));
        optionsBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        optionsBtn.setBounds(10, 165, 70, 70);
        panel.add(optionsBtn);

        JLabel optionsLabel = new JLabel("Finetune TimeSnapper to suit your needs");
        optionsLabel.setBounds(90, 190, 250, 20);
        panel.add(optionsLabel);
    }

    private Image loadImage(java.net.URL imageURL) {
        // Load the image from the given URL
        return Toolkit.getDefaultToolkit().getImage(imageURL);
    }

    private Image scaleImage(Image originalImage, int width, int height) {
        // Scale the image using getScaledInstance and return it directly
        return originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }


    public JPanel getPanel() {
        return panel;
    }
}
