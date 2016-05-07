package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPListening extends TCPState {
    @Override
    public void openConnection(int port) {

        System.out.println("Open connection in port " + port);
    }

    @Override
    public void closeConnection() {
        System.out.println("Connection is not open now");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Can't send message: "+message );
    }
}
