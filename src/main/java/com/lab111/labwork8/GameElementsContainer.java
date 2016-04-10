package com.lab111.labwork8;

import java.util.ArrayList;

/**
 * Created by kruku on 08.04.2016.
 */

/**
 * Composite
 */
public class GameElementsContainer implements  Cloneable {
    private Landscape landscape;
    ArrayList<Components> componentses;

    /**
     * Constructor for landscape
     */
    public GameElementsContainer(Landscape landscape) {
        this.landscape = landscape;
    }



    public void addComponents(Components component) {
        if (componentses == null) {
            componentses = new ArrayList<>();
        }
       componentses.add(component);
    }

    public void setComponentses(ArrayList<Components> componentses) {
        this.componentses = componentses;
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

    public ArrayList<Components> getComponentses() {
        return componentses;
    }

    public GameElementsContainer surfaceCloning() throws CloneNotSupportedException {
        GameElementsContainer clone = new GameElementsContainer(landscape);
        return clone;
    }

    public GameElementsContainer deepCloning() throws CloneNotSupportedException {
        GameElementsContainer clone = (GameElementsContainer) super.clone();
        clone.componentses = (ArrayList<Components>) componentses.clone();
        clone.landscape = landscape.clone();
        return clone;
    }
}
