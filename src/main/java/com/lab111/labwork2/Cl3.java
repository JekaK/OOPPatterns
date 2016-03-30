package com.lab111.labwork2;

/**
 * Created by kruku on 22.02.2016.
 */
public class Cl3 implements If3 {
    private Cl1 cl1;

    /**
     * Constructor
     */

    public Cl3() {
    }

    /**
     * Constructor with parameters
     *
     * @param cl1 name of method and class
     */
    public Cl3(Cl1 cl1) {
        this.cl1 = cl1;
    }


    /**
     *
     * @param cl1 set local Object
     */
    public void setCl1(Cl1 cl1){
        this.cl1 = cl1;
    }
    /**
     * @return name of method and class
     */
    @Override
    public String methl() {
        return "Method 1 Class 3";
    }



    /**
     * @return name of method and class
     */
    @Override
    public String meth3() {
        return "Method 3 Class 3";
    }
}

