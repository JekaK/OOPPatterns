package com.lab111.labwork9;

/**
 * Created by kruku on 13.04.2016.
 */

/**
 * Factory for OSXWidget
 */
public class OSXWidgetFactory extends AbstractFactory {
    /**
     * Constructor
     */
    public OSXWidgetFactory() {
    }
    /**
     *
     * @return Object of OSX class
     */
    @Override
    public GraphicalWidget getMyWidget() {
        return new OSXWidget();
    }
}
