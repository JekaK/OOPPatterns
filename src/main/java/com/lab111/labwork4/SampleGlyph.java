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
    protected char symbol;
    protected int x;
    protected int y;
    Color color;

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
     * @return X coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * @return Y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * @return color of glyph
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param x set local x
     */
    public void setX(int x) {
        this.x = x;

    }

    /**
     * @param y set local y
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * @param symbol set symbol
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * @param color sets color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * prints info
     */
    @Override
    public void print() {
        System.out.println("Glyph: " + symbol + " X: " + getX() + " Y: " + getY());
    }

}
