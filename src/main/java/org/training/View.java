package org.training;


import javax.swing.*;

public class View extends JFrame {

    private JLabel label = new JLabel("Bitcoin price");
    private JTextField text;
    private JButton button = new JButton("Refresh price");

    public View(String message) {

        JPanel panel = new JPanel();
        text = new JTextField(message);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        panel.add(label);
        panel.add(text);
        panel.add(button);

        // Add the panel to my view (JFrame)
        this.add(panel);
        this.setVisible(true);
    }
}
