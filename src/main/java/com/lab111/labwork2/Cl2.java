package com.lab111.labwork2;



/**
 * Created by kruku on 22.02.2016.
 */
public class Cl2 extends Cl1 implements If2 {
   private If1 if1 ;

    /**
     * Default constructor
     */
    public Cl2(){}

    /**
     *
     * @param if1 using for presentation of simple aggregation
     */
    public Cl2(If1 if1){
        this.if1 = if1;
    }

    /**
     *
     * @param if1 set local Object
     */
    public void setIf1(If1 if1){
        this.if1 = if1;
    }
    /**
     *Constructor with parameters
     * @return name of method and class
     */
    @Override
    public String methl() {
        return "Method 1 Class 2";
    }

    /**
     *
     * @return name of method and class
     */
    @Override
    public String meth2() {
        return "Method 2 Class 2";
    }

    /**
     *
     * @return name of method and class
     */
    @Override
    public String meth3() {
        return "Method 3 Class 2";
    }
}
