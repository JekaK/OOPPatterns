package com.lab111.labwork9;

/**
 * Created by kruku on 13.04.2016.
 */

/**
 * Factory for WinAPIWidget
 */
public class WinAPIWidgetFactory extends AbstractFactory {
    /**
     * Constructor
     */
    public WinAPIWidgetFactory() {
    }
    /**
     *
     * @return Object of WinAPI class
     */
    @Override
    public GraphicalWidget getMyWidget() {
        return new WinAPIWidget();
    }
}
