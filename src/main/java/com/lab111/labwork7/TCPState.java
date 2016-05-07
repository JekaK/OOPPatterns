package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public abstract class TCPState {
    private static Integer port;
    public abstract void openConnection(TCPConnection connection,int port);
    public abstract void closeConnection(TCPConnection connection);
    public abstract void sendMessage(TCPConnection connection,String message);
}
