package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        TCPConnection connection = new TCPConnection();

        connection.closeConnection();
        connection.closeConnection();
        connection.openConnection(34);
        connection.openConnection(34);
        connection.sendMessage("sdfs");
        connection.sendMessage("sdf");
        connection.openConnection(34);
        connection.closeConnection();
        connection.openConnection(34);
    }
}
