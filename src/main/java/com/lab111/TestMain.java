package com.lab111;


import com.lab111.labwork3.*;
import com.lab111.labwork4.Sentence;
import com.lab111.labwork8.GameLandscape;
import com.lab111.labwork8.Grass;
import com.lab111.labwork8.Tree;
import sun.security.provider.SHA;

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
        GameLandscape gameLandscape = new GameLandscape(0,0,"My landscape",500);
        gameLandscape.addTree(new Tree(30,400,30,40));
        gameLandscape.addTree(new Tree(50,50,60,150));
        gameLandscape.addGrass(new Grass(300,150,50,50));
        System.out.println("ORIGINAL");
        gameLandscape.draw();
        GameLandscape surfaceclone = gameLandscape.surfaceCloning();
        surfaceclone.addTree(new Tree(4,3,50,60));
        surfaceclone.setX(30);
        surfaceclone.setY(50);
        System.out.println("SURFACE CLONE");
        surfaceclone.draw();
        System.out.println("ORIGINAL");
        gameLandscape.draw();
    }
}
