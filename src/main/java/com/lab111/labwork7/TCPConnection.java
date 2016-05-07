package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        state = TCPClose.getInstance();
    }


    public void openConnection(int port) {
        state.openConnection(this, port);
    }

    public void closeConnection() {
        state.closeConnection(this);
    }

    public void sendMessage(String message) {
        state.sendMessage(this, message);
    }

    public void setState(TCPState state) {
        this.state = state;
    }

    public TCPState getState() {
        return state;
    }
}
