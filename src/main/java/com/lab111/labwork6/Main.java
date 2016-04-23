package com.lab111.labwork6;

/**
 * Created by Eugeniy Krukun on 22.04.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context(new BarChartDiagram());
        context.executeDiagram();
        context.setStrategy(new LineChartDiagram());
        context.executeDiagram();
    }
}
