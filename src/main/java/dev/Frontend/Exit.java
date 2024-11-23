package dev.Frontend;

import javax.swing.*;

public class Exit {
    public static void confirmExit(JFrame frame) {
        // Display confirmation dialog
        int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0); // Exit the application
        } else {
            // Do nothing, just close the dialog
        }
    }
}
