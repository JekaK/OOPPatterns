package com.lab111;


import com.lab111.labwork9.AbstractFactory;
import com.lab111.labwork9.FactoryProducer;
import com.lab111.labwork9.ProductInterface.GraphicalWidget;

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

        AbstractFactory factory = FactoryProducer.getFactory("GTK");
        GraphicalWidget widget = factory.getMyWidget();
        widget.showMe();
    }
}
