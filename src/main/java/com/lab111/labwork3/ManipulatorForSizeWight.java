package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kruku on 26.03.2016.
 */
public class ManipulatorForSizeWight extends Decorator {


    /**
     * Constructor that calls constructor of supper class
     *
     * @param shape object, that uses for initialise local object in supper class
     */
    public ManipulatorForSizeWight(Shape shape) {
        super(shape);
    }




    /**
     * Method for painting area
     */
    @Override
    public void paint() {
        int wNow = super.getW();
        wNow+=10;
        super.setW(wNow);
        super.paint();
    }
}
