package com.lab111.labwork8;

import java.util.ArrayList;

/**
 * Created by kruku on 09.04.2016.
 */
public class ComponentsMutant implements Cloneable,Components {
    ArrayList<Components> componentses = new ArrayList<>();

    public ComponentsMutant() {
    }
    public void add(Components component){

        componentses.add(component);
    }
    @Override
    public void draw() {

        System.out.println("===Mutant===");
        for (Components i: componentses){
            i.draw();
        }

    }
    public ComponentsMutant clone() throws CloneNotSupportedException {
        ComponentsMutant clone = (ComponentsMutant) super.clone();
        clone.componentses = (ArrayList<Components>) componentses.clone();
        return clone;
    }
}
