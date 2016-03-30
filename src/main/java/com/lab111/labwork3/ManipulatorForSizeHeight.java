package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by kruku on 26.03.2016.
 */
public class ManipulatorForSizeHeight extends Decorator {

    /**
     * Constructor that calls constructor of supper class
     *
     * @param shape object, that uses for initialise local object in supper class
     */
    public ManipulatorForSizeHeight(Shape shape) {
        super(shape);
    }


    /**
     * Set new size for area(just for jocking)
     *
     */



    /**
     * Method for painting area
     */
    @Override
    public void paint() {
        int hNow = super.getH();
        hNow+=10;
        super.setH(hNow);
        super.paint();

    }
}
