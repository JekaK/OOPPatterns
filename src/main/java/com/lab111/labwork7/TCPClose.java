package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPClose extends TCPState {
    private static final TCPClose closeConnection = new TCPClose();
    private TCPClose(){}

    public static TCPState getInstance(){
        return closeConnection;
    }


    @Override
    public void openConnection(TCPConnection connection, int port) {
        connection.setState(TCPListening.getInstance());
        connection.openConnection(port);
    }

    @Override
    public void closeConnection(TCPConnection connection) {
        System.out.println("Connection close now!");
    }

    @Override
    public void sendMessage(TCPConnection connection, String message) {
        System.out.println("Can't send message: "+message );
    }
}
