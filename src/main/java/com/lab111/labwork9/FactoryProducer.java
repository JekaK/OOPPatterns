package com.lab111.labwork9;

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
