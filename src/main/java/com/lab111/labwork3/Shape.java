package com.lab111.labwork3;

/**
 * Created by kruku on 25.03.2016.
 */

/**
 * Component class in Decorator(Wrapper) pattern custom implementation
 */
public interface Shape {

    /**
     * Method for painting area
     */
    public void paint();

    public int getX();

    public int getY();

    public int getW();

    public int getH();

    public void setX(int x);

    public void setY(int y);

    public void  setW(int w);

    public void setH(int h);
}
