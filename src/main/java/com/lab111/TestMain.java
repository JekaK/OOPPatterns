package com.lab111;


import com.lab111.labwork8.GameLandscapeGenerator;
import com.lab111.labwork8.Grass;
import com.lab111.labwork8.Landscape;
import com.lab111.labwork8.Tree;

/**
 * Template first class.
 *
 * @author Jeka Krukun
 */
public final class TestMain {

    /**
     * Constructor.
     */
    private TestMain() {
        super();
    }

    /**
     * Invokes at application startup.
     *
     * @param args Parameters from command line
     */
    public static void main(final String[] args) throws CloneNotSupportedException {
        GameLandscapeGenerator gameLandscapeGenerator = new GameLandscapeGenerator(new Landscape(1000,"MyLandscape"));
        gameLandscapeGenerator.addTree(new Tree(30,400,30,40));
        gameLandscapeGenerator.addTree(new Tree(50,50,60,150));
        gameLandscapeGenerator.addGrass(new Grass(300,150,50,50));
        System.out.println("ORIGINAL");
        gameLandscapeGenerator.draw();
        GameLandscapeGenerator surfaceclone = gameLandscapeGenerator.surfaceCloning();
        surfaceclone.addTree(new Tree(4,3,50,60));
        surfaceclone.getLandscape().setArea(50);
        System.out.println("SURFACE CLONE");
        surfaceclone.draw();
        System.out.println("ORIGINAL");
        gameLandscapeGenerator.draw();
    }
}
