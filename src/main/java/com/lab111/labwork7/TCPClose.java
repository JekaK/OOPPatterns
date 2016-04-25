package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPClose extends TCPState {

    @Override
    public void openConnection(int port) {
        System.out.println("Connection is opened in port "+super.getPort());
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection...");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Can't send message: "+message );
    }
}
