package com.lab111.labwork9;

import com.lab111.labwork9.Factories.GTKWidgetFactory;
import com.lab111.labwork9.Factories.OSXWidgetFactory;
import com.lab111.labwork9.Factories.QtWidgetFactory;
import com.lab111.labwork9.Factories.WinAPIWidgetFactory;

/**
 * Created by kruku on 13.04.2016.
 */
public class FactoryProducer {
    /**
     * Constructor
     */
    public FactoryProducer() {
    }

    /**
     * For simplify life
     * @param s name of widget technology
     * @return factory for same widget
     */
    public static AbstractFactory getFactory(String s){
        if(s == "WinApi"){
            return new WinAPIWidgetFactory();
        }
        if(s == "GTK"){
            return new GTKWidgetFactory();
        }
        if(s == "QT"){
            return new QtWidgetFactory();
        }
        if(s == "OSX"){
            return new OSXWidgetFactory();
        }
        return null;
    }
}
