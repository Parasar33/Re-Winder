package dev.Frontend;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Home extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private FileMenu fileMenu;
    private OptionsMenu optionsMenu;
    private HelpMenu helpMenu;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Home frame = new Home();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Home() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/fileMenu/icon.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setTitle("Re-Winder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 220);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(scaledIcon);

        // Load the background image
        contentPane = new JPanel() {
            private static final long serialVersionUID = 1L;
            private Image bgImage = new ImageIcon(getClass().getResource("/fileMenu/clouds.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();

                // Apply transparency to the background image
                g2d.setComposite(AlphaComposite.SrcOver.derive(0.4f)); // Adjust transparency (0.0f to 1.0f)
                g2d.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);

                g2d.dispose();
            }
        };

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Initialize menu interfaces
        fileMenu = new FileMenu();
        optionsMenu = new OptionsMenu();
        helpMenu = new HelpMenu();

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(199, 237, 230)); // Set the background color of the menu bar
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenuItem homeItem = new JMenuItem("Home         ....");
        JMenuItem exitItem = new JMenuItem("Exit     Alt + F4");

        homeItem.setFont(UIManager.getFont("Button.font"));
        homeItem.addActionListener(e -> showPanel(Home.this.fileMenu.getPanel()));

        exitItem.setFont(UIManager.getFont("Button.font"));
        exitItem.addActionListener(e -> Exit.confirmExit(this));

        fileMenu.add(homeItem);
        fileMenu.add(exitItem);

        JMenu viewMenu = new JMenu("Options");
        JMenuItem viewMenuItem = new JMenuItem("View Options");
        viewMenuItem.addActionListener(e -> showPanel(Home.this.optionsMenu.getPanel()));
        viewMenu.add(viewMenuItem);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem helpMenuItem = new JMenuItem("Help Options");
        helpMenuItem.addActionListener(e -> showPanel(Home.this.helpMenu.getPanel()));
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
        panel.setOpaque(false); // Ensure the panel doesn’t block the background
        contentPane.revalidate();
        contentPane.repaint();
    }
}
