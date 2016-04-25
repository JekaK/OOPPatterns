package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPListening extends TCPState {
    @Override
    public void openConnection(int port) {
        super.setPort(port);
        System.out.println("Opening connection in port " + super.getPort());
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
