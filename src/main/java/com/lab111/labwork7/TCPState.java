package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public abstract class TCPState {
    private static int port;
    public abstract void openConnection(int port);
    public abstract void closeConnection();
    public abstract void sendMessage(String message);

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
