package com.mani;

public class Building {

    String b;
    public static final String ASER="HJ";

    public Building(String b) {
        this.b = b;
    }

    void paint(){
        System.out.println("building paint  " +b);
    }
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
