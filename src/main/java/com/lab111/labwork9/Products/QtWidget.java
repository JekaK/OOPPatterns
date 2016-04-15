package com.lab111.labwork9.Products;

import com.lab111.labwork9.ProductInterface.GraphicalWidget;

import javax.swing.*;

/**
 * Created by kruku on 13.04.2016.
 */
public class QtWidget implements GraphicalWidget {
    /**
     * Constructor
     */
    public QtWidget() {
    }
    /**
     * Show widget of chosen widget
     */
    @Override
    public void showMe() {
        JFrame frame = new JFrame("QtWidget");
        JLabel label = new JLabel(new ImageIcon("D:\\Development\\Patterns\\template\\src\\main\\java\\com\\lab111\\labwork9\\Logo\\qt.png"));
        label.setVisible(true);
        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
