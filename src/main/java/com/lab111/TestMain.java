package com.lab111;


import com.lab111.labwork9.AbstractFactory;
import com.lab111.labwork9.FactoryProducer;

import com.lab111.labwork9.GraphicalWidget;

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
    public static void main(final String[] args)  {

        AbstractFactory factory = FactoryProducer.getFactory("OSX");
        try {
            GraphicalWidget widget = factory.getMyWidget();
            widget.showMe();
        }catch (NullPointerException e){
            System.out.println("Widget is null");
        }
    }
}
