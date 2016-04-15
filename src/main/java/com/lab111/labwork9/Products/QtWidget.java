package com.lab111.labwork9.Products;

import com.lab111.labwork9.ProductInterface.GraphicalWidget;

/**
 * Created by kruku on 13.04.2016.
 */
public class QtWidget implements GraphicalWidget {
    @Override
    public void showMe() {
        System.out.println("QTWidget");
    }
}
