package ru.testspring.impl;

public class Database {

    public Database(){
        connectTest();
    }

    private void connectTest(){
        System.out.println("CONNECTION");
    }
}
