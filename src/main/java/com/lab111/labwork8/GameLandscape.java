package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by kruku on 08.04.2016.
 */

/**
 * Composite
 */
public class GameLandscape implements Components, Cloneable {
    private int x, y, area;
    private String name;
    private ArrayList<Tree> trees;
    private ArrayList<Grass> grasses;

    /**
     * Constructor for landscape
     *
     * @param x    coordinate X
     * @param y    coordinate Y
     * @param name name of landscape
     * @param area area of landscape
     */
    public GameLandscape(int x, int y, String name, int area) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.area = area;
    }

    /**
     * Add tree in landscape
     *
     * @param tree tree object with specified params
     */
    public void addTree(Tree tree) {
        if (trees == null) {
            trees = new ArrayList<>();
        }
        trees.add(tree);
    }

    /**
     * Add grass to landscape
     *
     * @param grass grass object with params
     */
    public void addGrass(Grass grass) {
        if (grasses == null) {
            grasses = new ArrayList<>();
        }
        grasses.add(grass);
    }

    /**
     * @return coordinate of X
     */
    public int getX() {
        return x;
    }

    /**
     * @return coordinate of Y
     */
    public int getY() {
        return y;
    }

    /**
     * @return name of landscape
     */
    public String getName() {
        return name;
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
     * @param name name of landscape
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Draw landscape
     */
    @Override
    public void draw() {
        System.out.println("Landscape: " + getName() + " X: " + getX() + " Y: " + getY());
        System.out.println("===TREES===");
        for (Tree i : trees) {
            i.draw();
        }
        System.out.println("===GRASSES===");
        for (Grass i : grasses) {
            i.draw();
        }
    }

    public GameLandscape surfaceCloning() throws CloneNotSupportedException {
        return (GameLandscape) super.clone();
    }

    public GameLandscape deepCloning() throws CloneNotSupportedException {
        GameLandscape clone = (GameLandscape) super.clone();
        clone.trees = (ArrayList<Tree>) trees.clone();
        clone.grasses = (ArrayList<Grass>) grasses.clone();
        return clone;
    }
}
