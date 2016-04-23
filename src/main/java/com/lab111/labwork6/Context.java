package com.lab111.labwork6;

import javafx.scene.Scene;

/**
 * Created by Eugeniy Krukun on 22.04.2016.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void executeDiagram() throws Exception {
        strategy.showDiagram();
    }

    public void setStrategy(Strategy strategy) {

        this.strategy = strategy;
    }
}
