package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        System.out.println("===TCPLISTENING STATE===");
        connection.openConnection(456);
        connection.sendMessage("Some Text");
        connection.closeConnection();
        System.out.println("====TCPESTABLISHED STATE===");
        connection.setEstablishedStateAsMain();
        connection.openConnection(456);
        connection.sendMessage("Some Text");
        connection.closeConnection();
        System.out.println("==TCPCONNECTION STATE===");
        connection.setClosingStateAsMain();
        connection.openConnection(456);
        connection.sendMessage("Some Text");
        connection.closeConnection();
    }
}
