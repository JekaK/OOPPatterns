package com.lab111.labwork9;

import com.lab111.labwork9.ProductInterface.GraphicalWidget;

/**
 * Created by kruku on 13.04.2016.
 */
public abstract class AbstractFactory {
    /**
     *
     * @return widget of chosen technology
     */
    public abstract GraphicalWidget getMyWidget() ;
}
