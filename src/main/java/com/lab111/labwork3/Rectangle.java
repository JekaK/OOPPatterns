package com.lab111.labwork3;

/**
 * Created by kruku on 25.03.2016.
 */

/**
 * Concrete component class in Decorator(Wrapper) pattern implementation
 */
public class Rectangle implements Shape{
    /**
     * params for coordinates and height and wight
     */
    private int x,y,h,w;

    /**
     * Standard constructor
     */
    public Rectangle() {
    }

    /**
     *
     * @param x for local param x
     * @param y for local param y
     * @param h for local param h
     * @param w for local param w
     */
    public Rectangle(int x, int y,int h, int w) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    /**
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @return height
     */
    public int getH() {
        return h;
    }

    /**
     *
     * @return wight
     */
    public int getW() {
        return w;
    }

    /**
     *
     * @param x set param x
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     *
     * @param y set param y
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     *
     * @param w set param w
     */
    public void setW(int w) {
        this.w = w;
    }
    /**
     *
     * @param h set param h
     */
    public void setH(int h) {
        this.h = h;
    }



    /**
     * Paint area
     */
    @Override
    public void paint() {
        System.out.println("Rectangle: "+"Position: X = "+getX()+" Y = "+getY()+" Size: "+getH()*getW());
    }
}
