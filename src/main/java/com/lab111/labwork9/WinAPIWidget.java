package com.lab111.labwork9;

import javax.swing.*;

/**
 * Created by kruku on 13.04.2016.
 */
public class WinAPIWidget implements GraphicalWidget {
    /**
     * Constructor
     */
    public WinAPIWidget() {
    }
    /**
     * Show widget of chosen widget
     */
    @Override
    public void showMe() {
        JFrame frame = new JFrame("WinAPIWidget");
        JLabel label = new JLabel(new ImageIcon("D:\\Development\\Patterns\\template\\src\\main\\java\\com\\lab111\\labwork9\\Logo\\win.png"));
        label.setVisible(true);
        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
