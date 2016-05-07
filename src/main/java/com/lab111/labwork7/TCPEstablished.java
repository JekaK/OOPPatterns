package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPEstablished extends TCPState {
    private static final TCPEstablished established = new TCPEstablished();
    private TCPEstablished(){}

    public static TCPState getInstance(){
        return established;
    }


    @Override
    public void openConnection(TCPConnection connection, int port) {
        System.out.println("Connection already open in port " + port);
    }

    @Override
    public void closeConnection(TCPConnection connection) {
        System.out.println("Connection closing...");
        connection.setState(TCPClose.getInstance());
    }

    @Override
    public void sendMessage(TCPConnection connection, String message) {
        System.out.println("Sending message: " + message);
    }

}
