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
    private Landscape landscape;
    private ArrayList<Tree> trees;
    private ArrayList<Grass> grasses;

    /**
     * Constructor for landscape
     */
    public GameLandscape(Landscape landscape) {
        this.landscape = landscape;
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
     *
     * @return current landscape
     */
    public Landscape getLandscape() {
        return landscape;
    }

    /**
     *
     * @param landscape new landscape
     */
    public void setLandscape(Landscape landscape) {
        this.landscape = landscape;
    }

    /**
     * Draw landscape
     */
    @Override
    public void draw() {
        System.out.println("===Landscape===");
        landscape.draw();
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
        clone.landscape = landscape.clone();
        return clone;
    }
}
