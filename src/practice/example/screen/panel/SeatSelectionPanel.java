package practice.example.screen.panel;

import practice.example.screen.frame.BaseFrame;

import javax.swing.*;

public class SeatSelectionPanel extends JPanel {
    BaseFrame baseFrame;

    private SeatSelectionPanel() {}

    public SeatSelectionPanel(BaseFrame baseFrame) {
        baseFrame.setTitle("좌석 선택");
        this.baseFrame = baseFrame;
    }
}
