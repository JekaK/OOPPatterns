package com.lab111.labwork3;

/**
 * Created by kruku on 25.03.2016.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete decorator class in Decorator (Wrapper) pattern realisation
 */
public class ManipulatorForXLeft extends Decorator {

    /**
     * Constructor that calls constructor of supper class
     *
     * @param shape object, that uses for initialise local object in supper class
     */
    public ManipulatorForXLeft(Shape shape) {
        super(shape);
    }


    /**
     * Method for painting area
     */
    @Override
    public void paint() {
        int xNow = super.getX();
        xNow-=10;
        super.setX(xNow);
        super.paint();
    }


}