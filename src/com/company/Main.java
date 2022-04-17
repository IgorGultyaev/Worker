package com.company;


public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener taskError=System.out::println;

        Worker worker = new Worker(listener,taskError, 33);
        worker.start();

    }
}
