package dev.Frontend;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class HelpMenu {
    private JPanel panel;

    public HelpMenu() {
        initialize();
    }

    private void initialize() {
        panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        panel.setBounds(0, 0, 450, 300);

        // Add your Help menu components here
        // Example label to show this is Help interface
        JLabel helpLabel = new JLabel("Help Interface");
        helpLabel.setBounds(10, 10, 100, 20);
        panel.add(helpLabel);
    }

    public JPanel getPanel() {
        return panel;
    }
}