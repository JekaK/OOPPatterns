package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kruku on 26.03.2016.
 */
public class ManipulatorForYUp extends Decorator {

    /**
     * Constructor that calls constructor of supper class
     *
     * @param shape object, that uses for initialise local object in supper class
     */
    public ManipulatorForYUp(Shape shape) {
        super(shape);
    }




    /**
     * Method for painting area
     */
    @Override
    public void paint() {
        int yNow = super.getY();
        yNow+=10;
        super.setY(yNow);
        super.paint();
    }

}
