package com.lab111.labwork8;

/**
 * Created by kruku on 09.04.2016.
 */
public class CompositeLandscape implements Cloneable,Components {
    String name;
    private GameElementsContainer result;

    public CompositeLandscape(String name, GameElementsContainer result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Draw landscape
     */
    @Override
    public void draw() {
        System.out.println("===Landscape===");
        result.getLandscape().draw();
        if(result.getComponentses()==null){
            System.out.println("Landscape is null");
            return;
        }
        for (Components i:result.getComponentses()){
            i.draw();
        }
    }
}
