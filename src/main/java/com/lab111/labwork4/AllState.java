package com.lab111.labwork4;

import java.awt.*;

/**
 * Created by kruku on 31.03.2016.
 */
public class AllState {
    protected int x;
    protected int y;
    Color color;



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
     * @param color sets color
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
