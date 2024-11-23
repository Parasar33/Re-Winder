package dev.Frontend;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private FileMenu fileMenu;
    private ViewMenu viewMenu;
    private HelpMenu helpMenu;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Home() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/fileMenu/icon.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setTitle("TimeSnapper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(scaledIcon); // Set the resized icon here

        // Initialize panels
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 240, 240));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Initialize menu interfaces
        fileMenu = new FileMenu();
        viewMenu = new ViewMenu();
        helpMenu = new HelpMenu();

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem homeItem = new JMenuItem("Home         ....");
        JMenuItem exitItem = new JMenuItem("Exit     Alt + F4");
        homeItem.setFont(UIManager.getFont("Button.font"));
        homeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(Home.this.fileMenu.getPanel());
            }
        });
        exitItem.setFont(UIManager.getFont("Button.font"));
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((JComponent) e.getSource());
                // Call the confirmExit method to show the confirmation dialog
                Exit.confirmExit(frame);
            }
        });

        fileMenu.add(homeItem);
        fileMenu.add(exitItem);
        // View Menu
        JMenu viewMenu = new JMenu("View");
        JMenuItem viewMenuItem = new JMenuItem("View Options");
        viewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(Home.this.viewMenu.getPanel());
            }
        });
        viewMenu.add(viewMenuItem);

        // Help Menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem helpMenuItem = new JMenuItem("Help Options");
        helpMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(Home.this.helpMenu.getPanel());
            }
        });
        helpMenu.add(helpMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        // Show File interface by default
        showPanel(this.fileMenu.getPanel());
    }

    private void showPanel(JPanel panel) {
        contentPane.removeAll();
        contentPane.add(panel);
        contentPane.revalidate();
        contentPane.repaint();
    }
}
