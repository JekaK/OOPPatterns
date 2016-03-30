package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kruku on 26.03.2016.
 */
public class ManipulatorForXRight extends Decorator{
    List<Integer> list = new ArrayList<>();

    /**
     * Constructor that calls constructor of supper class
     *
     * @param shape object, that uses for initialise local object in supper class
     */
    public ManipulatorForXRight(Shape shape) {
        super(shape);
    }




    /**
     * Method for painting area
     */
    @Override
    public void paint() {
        int xNow = super.getX();
        xNow+=10;
        super.setX(xNow);
        super.paint();
    }

}
