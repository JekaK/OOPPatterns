package com.lab111.labwork9;

import javax.swing.*;

/**
 * Created by kruku on 13.04.2016.
 */
public class OSXWidget implements GraphicalWidget {
    /**
     * Constructor
     */
    public OSXWidget() {
    }
    /**
     * Show widget of chosen widget
     */
    @Override
    public void showMe() {
        JFrame frame = new JFrame("OSX");
        JLabel label = new JLabel(new ImageIcon("D:\\Development\\Patterns\\template\\src\\main\\java\\com\\lab111\\labwork9\\Logo\\osx.png"));
        label.setVisible(true);
        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
