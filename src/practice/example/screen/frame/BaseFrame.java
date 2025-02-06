package practice.example.screen.frame;

import practice.example.screen.panel.SeatSelectionPanel;
import practice.example.screen.panel.WelcomePanel;

import javax.swing.*;

public class BaseFrame extends JFrame{
    public BaseFrame() {
        this.add(new WelcomePanel(this));
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void changePanel (JPanel jPanel) {
        this.getContentPane().removeAll();
        this.add(jPanel);
        this.revalidate();
        this.repaint();
    }
}
