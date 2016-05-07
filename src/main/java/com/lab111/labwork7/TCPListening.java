package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPListening extends TCPState {
    private static final TCPListening tcpListening = new TCPListening();
    private TCPListening(){}
    public static TCPState getInstance(){
        return tcpListening;
    }

    @Override
    public void openConnection(TCPConnection connection,int port) {
        System.out.println("Open connection in port " + port);
        connection.setState(TCPEstablished.getInstance());
    }

    @Override
    public void closeConnection(TCPConnection connection) {
        System.out.println("Connection is close now");
        connection.setState(TCPClose.getInstance());
    }

    @Override
    public void sendMessage(TCPConnection connection, String message) {
        System.out.println("Can't send message: "+message );
    }

}
