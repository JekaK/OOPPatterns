package com.lab111.labwork4;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kruku on 29.03.2016.
 */

/**
 * Concrete Flyweight
 */
public class SampleGlyph extends JComponent implements Glyph {
    private char symbol;

    /**
     * @param symbol some symbol for setting
     */
    public SampleGlyph(char symbol) {
        this.symbol = symbol;
    }

    /**
     * @return symbol
     */
    public char getSymbol() {
        return symbol;
    }
    /**
     * @param symbol set symbol
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * prints info
     */
    @Override
    public void print(MyContext context) {
        System.out.println("Glyph: " + symbol + " X: " + context.getX() + " Y: " + context.getY());
    }

}
