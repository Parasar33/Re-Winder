package dev.Frontend;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileMenu {
    private JPanel panel;
    private JTextField pathField;

    // Declare Image icons at the start
    private Image recordIcon;
    private Image playMovieIcon;
    private Image creditIcon;
    private Image tutorialIcon;
    private Image browseIcon;
    private Image openIcon;

    public FileMenu() {
        initialize();
    }

    private void initialize() {
        // Initialize images
        ClassLoader classLoader = getClass().getClassLoader();
        recordIcon = loadImage(classLoader.getResource("fileMenu/record.png"));
        playMovieIcon = loadImage(classLoader.getResource("fileMenu/play.png"));
        creditIcon = loadImage(classLoader.getResource("fileMenu/credit.png"));
        tutorialIcon = loadImage(classLoader.getResource("fileMenu/tutorial.png"));
        browseIcon = loadImage(classLoader.getResource("fileMenu/browse.png"));
        openIcon = loadImage(classLoader.getResource("fileMenu/open.png"));

        // Initialize panel
        panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        panel.setBounds(0, 0, 450, 220);

        // Record Section
        JButton recordBtn = new JButton();
        recordBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        // Scale the image to fit the button
        recordBtn.setBackground(new Color(0, 0, 0, 0));
        recordBtn.setOpaque(false);
        recordBtn.setIcon(new ImageIcon(recordIcon));
        recordBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        recordBtn.setBounds(10, 5, 70, 70);
        panel.add(recordBtn);

        // Path and Interval fields
        JLabel pathLabel = new JLabel("Path");
        pathLabel.setBounds(90, 30, 30, 20);
        panel.add(pathLabel);

        pathField = new JTextField("C:/RISHAV/Downloads/Snapshots");
        pathField.setBounds(124, 31, 233, 20);
        pathField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(pathField);

        JLabel intervalLabel = new JLabel("Choose Interval");
        intervalLabel.setBounds(90, 55, 90, 20);
        panel.add(intervalLabel);

        JTextField intervalField = new JTextField("5");
        intervalField.setBounds(185, 55, 30, 20);
        intervalField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(intervalField);

        JLabel secondsLabel = new JLabel("(sec)");
        secondsLabel.setBounds(215, 55, 30, 20);
        panel.add(secondsLabel);

        // Play Movie Section
        JButton playMovieBtn = new JButton();
        // Scale the image to fit the button
        playMovieBtn.setBackground(new Color(0, 0, 0, 0));
        playMovieBtn.setOpaque(false);
        playMovieBtn.setIcon(new ImageIcon(playMovieIcon));
        playMovieBtn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        playMovieBtn.setBounds(10, 85, 70, 70);
        panel.add(playMovieBtn);

        JLabel playLabel = new JLabel("Action Replayy : Re-Wind your day");
        playLabel.setBounds(90, 110, 200, 20);
        panel.add(playLabel);
        
        JButton creditButton = new JButton();
        creditButton.setBackground(new Color(0, 0, 0, 0));
        creditButton.setBounds(357, 123, 32, 32);
        creditButton.setOpaque(false);
        creditButton.setIcon(new ImageIcon(creditIcon));
        panel.add(creditButton);
        
        JButton tutorialButton = new JButton();
        tutorialButton.setBackground(new Color(0, 0, 0, 0));
        tutorialButton.setBounds(395, 123, 32, 32);
        tutorialButton.setOpaque(false);
        tutorialButton.setIcon(new ImageIcon(tutorialIcon));
        panel.add(tutorialButton);
        
        
        JButton browseBtn = new JButton();
        browseBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        browseBtn.setBackground(new Color(0, 0, 0, 0));
        browseBtn.setOpaque(false);
        browseBtn.setIcon(new ImageIcon(browseIcon));
        browseBtn.setBounds(360, 31, 20, 20);
        panel.add(browseBtn);

        
        JButton openButton = new JButton();
        openButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        openButton.setBackground(new Color(0, 0, 0, 0));
        openButton.setOpaque(false);
        openButton.setIcon(new ImageIcon(openIcon));
        openButton.setBounds(383, 31, 20, 20);
        panel.add(openButton);
        
        JLabel lblChooseTheLocal = new JLabel("Choose the local Storage");
        lblChooseTheLocal.setBounds(90, 5, 145, 20);
        panel.add(lblChooseTheLocal);
    }

    private Image loadImage(java.net.URL imageURL) {
        // Load the image from the given URL
        return Toolkit.getDefaultToolkit().getImage(imageURL);
    }

    public JPanel getPanel() {
        return panel;
    }
}
