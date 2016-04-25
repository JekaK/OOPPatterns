package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPEstablished extends TCPState {

    @Override
    public void openConnection(int port) {
        System.out.println("Connection is open in port " + super.getPort());
    }

    @Override
    public void closeConnection() {
        System.out.println("Cant close connection");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
