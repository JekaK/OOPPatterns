package com.lab111.labwork3;

/**
 * Created by kruku on 25.03.2016.
 */

/**
 * Decorator in Decorator(Wrapper) pattern realisation
 */
public abstract class Decorator implements Shape {
    /**
     * Object of interface Shape
     */
    public Shape shape;

    /**
     * Constructor with params
     * @param shape for initialise local param
     */
    public Decorator(Shape shape){this.shape = shape;}
    @Override
    public int getX() {
        return shape.getX();
    }

    @Override
    public int getY() {
        return shape.getY();
    }

    @Override
    public int getW() {
        return shape.getW();
    }

    @Override
    public int getH() {
        return shape.getH();
    }

    public void setX(int x) {
        shape.setX(x);
    }
    /**
     *
     * @param y set param y
     */
    public void setY(int y) {
        shape.setY(y);
    }
    /**
     *
     * @param w set param w
     */
    public void setW(int w) {
        shape.setW(w);
    }
    /**
     *
     * @param h set param h
     */
    public void setH(int h) {
        shape.setH(h);
    }
    @Override
    public void paint() {
        this.shape.paint();
    }


}
