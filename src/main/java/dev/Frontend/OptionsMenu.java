package dev.Frontend;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class OptionsMenu {
    private JPanel panel;

    public OptionsMenu() {
        initialize();
    }

    private void initialize() {
        panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        panel.setBounds(0, 0, 450, 300);

        // Add your View menu components here
        // Example label to show this is View interface
        JLabel viewLabel = new JLabel("View Interface");
        viewLabel.setBounds(10, 10, 100, 20);
        panel.add(viewLabel);
    }

    public JPanel getPanel() {
        return panel;
    }
}