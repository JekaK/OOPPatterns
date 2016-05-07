package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        TCPConnection connection = new TCPConnection();

        connection.closeConnection();
        connection.sendMessage("sdf");
        connection.openConnection(45);
        connection.openConnection(45);
        connection.sendMessage("sdfsd");
        connection.sendMessage("sdf");
        connection.closeConnection();
        connection.closeConnection();
    }
}
