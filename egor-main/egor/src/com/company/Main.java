package com.company;

public class Main {

    public static void main(String[] args) {
        start();

    }
    public static void start(){
        Injector injector = new Injector();
        injector.create_UI();
    }
}
