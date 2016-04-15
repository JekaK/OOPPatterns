package com.lab111.labwork9.Factories;

import com.lab111.labwork9.AbstractFactory;
import com.lab111.labwork9.ProductInterface.GraphicalWidget;
import com.lab111.labwork9.Products.GTKWidget;

/**
 * Created by kruku on 13.04.2016.
 */

/**
 * Factory for GTKWidget
 */
public class GTKWidgetFactory extends AbstractFactory {
    /**
     * Constructor
     */
    public GTKWidgetFactory() {
    }

    /**
     *
     * @return Object of GTKWidget class
     */
    @Override
    public GraphicalWidget getMyWidget() {
        return new GTKWidget();
    }
}
