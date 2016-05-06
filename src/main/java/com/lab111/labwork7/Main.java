package com.lab111.labwork7;

/**
 * Created by Eugeniy Krukun on 25.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        connection.openConnection(43);
        connection.sendMessage("sdf");
        connection.openConnection(43);
        connection.openConnection(433);
        connection.sendMessage("sdfsdf");
        connection.sendMessage("sdf");
        connection.closeConnection();
        connection.closeConnection();
        connection.sendMessage("sdfsdf");
        connection.closeConnection();
    }
}
