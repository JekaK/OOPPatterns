package com.lab111.labwork8;

/**
 * Created by kruku on 08.04.2016.
 */

/**
 * Leaf
 */
public class Landscape implements Components, Cloneable {
    private int area;


    public Landscape(int area) {
        this.area = area;

    }


    /**
     * @return area
     */
    public int getArea() {
        return area;
    }


    /**
     * @param area set area
     */
    public void setArea(int area) {
        this.area = area;
    }


    public Landscape clone() throws CloneNotSupportedException {
        Landscape clone = (Landscape) super.clone();
        return clone;
    }

    @Override
    public void draw() {
        System.out.println("Landscape " + " Area: " + getArea());
    }
}
