package com.lab111.labwork4;

/**
 * Created by kruku on 29.03.2016.
 */

/**
 * Unshared Flyweight
 */
public class SampleGlyph extends Glyph  {
    private char symbol;

    /**
     * @param symbol some symbol for setting
     */
    public SampleGlyph(char symbol) {
        this.symbol = symbol;
    }

    /**


    /**
     * prints info
     */
    @Override
    public void print(AllState context) {
        System.out.println("Glyph: " + symbol + " X: " + context.getX() + " Y: " + context.getY());
    }

}
