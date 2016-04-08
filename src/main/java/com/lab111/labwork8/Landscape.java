package com.lab111.labwork8;

/**
 * Created by kruku on 08.04.2016.
 */
public class Landscape implements Components,Cloneable {
    private int area;
    private String name;

    public Landscape( int area, String name) {
        this.area = area;
        this.name = name;
    }

    /**
     * @return name of landscape
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return area
     */
    public int getArea() {
        return area;
    }



    /**
     *
     * @param area set area
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @param name name of landscape
     */
    public void setName(String name) {
        this.name = name;
    }
    public Landscape clone() throws CloneNotSupportedException {
        Landscape clone = (Landscape) super.clone();
        return clone;
    }
    @Override
    public void draw() {
        System.out.println("Landscape: " + getName() + " Area: "+getArea());
    }
}
