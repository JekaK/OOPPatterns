package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        setListeningStateAsMain();
    }

    public void setListeningStateAsMain() {
        state = new TCPListening();
    }
    public void setClosingStateAsMain(){
        state = new TCPClose();
    }
    public void setEstablishedStateAsMain(){
        state = new TCPEstablished();
    }
    public void openConnection(int port) {
        state.openConnection(port);
    }

    public void closeConnection() {
        state.closeConnection();
    }

    public void sendMessage(String message) {
        state.sendMessage(message);
    }
}
