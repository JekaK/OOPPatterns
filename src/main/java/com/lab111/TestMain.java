package com.lab111;


import com.lab111.labwork8.*;

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

        GameElementsContainer gameElementsContainer = new GameElementsContainer(new Landscape(1000));

        CompositeLandscape compositeLandscape = new CompositeLandscape("MyLand", gameElementsContainer);

        ComponentsMutant mutant = new ComponentsMutant();
        mutant.add(new Grass(4, 50, 4, 5));
        ComponentsMutant mutant1 = new ComponentsMutant();
        mutant1.add(mutant);
        mutant1.add(new Tree(3, 56, 2, 1));
        mutant1.add(new Grass(5, 3, 13, 5));
        ComponentsMutant mutant2 = new ComponentsMutant();
        mutant2.add(mutant1);
        ComponentsMutant mutant3 = new ComponentsMutant();
        mutant3.add(mutant2);
        mutant3.add(new Tree(1, 56, 34, 5));

        gameElementsContainer.addComponents(mutant3);
        System.out.println("===Original===");
        compositeLandscape.draw();
        System.out.println("===CLONE===");
        CompositeLandscape clone = new CompositeLandscape("MyLand2", gameElementsContainer.surfaceCloning());
        clone.draw();

    }
}
