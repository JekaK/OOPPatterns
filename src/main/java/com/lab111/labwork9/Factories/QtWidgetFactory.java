package com.lab111.labwork9.Factories;

import com.lab111.labwork9.AbstractFactory;
import com.lab111.labwork9.ProductInterface.GraphicalWidget;
import com.lab111.labwork9.Products.QtWidget;

/**
 * Created by kruku on 13.04.2016.
 */
public class QtWidgetFactory extends AbstractFactory {
    @Override
    public GraphicalWidget getMyWidget() {
        return new QtWidget();
    }
}
