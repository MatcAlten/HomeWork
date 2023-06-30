package com.ex.thread.thread.example;

public class ThreadExRunClass implements Runnable {


    private int threadNumber;

    public ThreadExRunClass(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);           //dealy,addormentiamo il thread per 1 secondo,quindi tra una stampa e l altra el for ci sarà una pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}