package com.lab111.labwork8;

/**
 * Created by kruku on 08.04.2016.
 */

/**
 * Leaf
 */
public class Grass implements Components, Cloneable {
    private int density;
    private int area;
    private int x, y;


    /**
     * Constructor fo tree
     *
     * @param density density of grass
     * @param area    area of grass
     * @param x       coordinate X
     * @param y       coordinate Y
     */
    public Grass(int density, int area, int x, int y) {
        this.density = density;
        this.area = area;
        this.x = x;
        this.y = y;
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
     * @return density of grass
     */
    public int getDensity() {
        return density;
    }

    /**
     * @return area of grass
     */
    public int getArea() {
        return area;
    }

    /**
     * @param x coordinate X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y coordinate Y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param density density of grass
     */
    public void setDensity(int density) {
        this.density = density;
    }

    /**
     * @param area area of grass
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Draw tree in landscape
     */
    @Override
    public void draw() {
        System.out.println("X: " + getX() + " Y: " + getY() + " Area: " + getArea() + " Density: " + getDensity());
    }
}
