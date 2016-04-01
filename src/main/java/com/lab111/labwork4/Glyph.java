package com.lab111.labwork4; /**
 * Created by kruku on 28.03.2016.
 */

/**
 * Flyweight
 */
public abstract class Glyph {
    /**
     * prints info of glyph
     */
    public abstract void print(MyContext context);

    /**
     *
     * @return symbol of glyph
     */
    public abstract char getSymbol();

}
