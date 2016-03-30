package com.lab111.labwork2;



/**
 * Created by kruku on 22.02.2016.
 */
public class Cl1 implements If1 {
   private Cl1 cl1 ;
    /**
     * Default constructor
     * */
    public Cl1() {
    }
    /**
    * Constructor with param
    * @param cl1 using for presentation of simple aggregation
    * */
    public Cl1(Cl1 cl1) {
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
     *
     * @return name of method and class
     */
    @Override
    public String methl() {
        return "Method 1 Class 1";
    }

}
