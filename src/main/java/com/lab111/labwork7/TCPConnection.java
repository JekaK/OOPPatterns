package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
    }


    public void openConnection(int port) {

        if (state instanceof TCPState) {
            if (state.getPort() == port) {
                System.out.println("Connection is already open in port " + port);
            }
            else
            {
                System.out.println("This connection is already busy");
            }
        } else {
            if (state == null) {
                state = new TCPListening();
                state.setPort(port);
            }
            state.openConnection(port);
        }
    }

    public void closeConnection() {

        if (state instanceof TCPClose) {
            System.out.println("Connection is already close");
        } else {
            if (state instanceof TCPListening || state instanceof TCPEstablished) {
                state = new TCPClose();
                state.closeConnection();
                state = null;
            } else {
                System.out.println("Connection is not opened");
            }
        }
    }

    public void sendMessage(String message) {

        if (state instanceof TCPEstablished) {
            state.sendMessage(message);
        } else {
            if (state instanceof TCPListening) {
                state = new TCPEstablished();
                state.sendMessage(message);
            } else {
                System.out.println("Connection is closed!Can't send message");
            }
        }
    }

    public void setState(TCPState state) {
        this.state = state;
    }

    public TCPState getState() {
        return state;
    }
}
