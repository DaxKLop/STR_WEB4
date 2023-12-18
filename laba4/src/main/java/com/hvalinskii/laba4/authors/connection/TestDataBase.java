package com.hvalinskii.laba4.authors.connection;


import java.sql.SQLException;


public class TestDataBase {

    public static void main(String[] argv) {

        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            JDBC.connect();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return;
        }

        JDBC.close();

    }

}
