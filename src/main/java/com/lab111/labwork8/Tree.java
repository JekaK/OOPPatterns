package com.lab111.labwork8;

/**
 * Created by kruku on 08.04.2016.
 */
public class Tree implements Components, Cloneable {
    private int height;
    private int age;
    private int x, y;


    /**
     * Constructor for tree
     *
     * @param height height of tree
     * @param age    age of tree
     * @param x      coordinate X
     * @param y      coordinate Y
     */
    public Tree(int height, int age, int x, int y) {
        this.height = height;
        this.age = age;
        this.x = x;
        this.y = y;
    }

    /**
     * @return coordinate X
     */
    public int getX() {
        return x;
    }

    /**
     * @return coordinate Y
     */
    public int getY() {
        return y;
    }

    /**
     * @return height of tree
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return age of tree
     */
    public int getAge() {
        return age;
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
     * @param height height of tree
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @param age age of tree
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Draw tree in landscape
     */
    @Override
    public void draw() {
        System.out.println("X: " + getX() + " Y: " + getY() + " Height: " + getHeight() + " Age: " + getAge());
    }
}
