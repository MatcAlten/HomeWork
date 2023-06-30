package com.ex.thread.thread.example;

public class ThreadExThrClass extends Thread{


    private int threadNumber;

    //public ThreadEx(){  super();  }

    public ThreadExThrClass(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        setName("thread1"); //assegno il nome a questo thread
        System.out.println("Thread name: " + Thread.currentThread().getName());


        for(int i=1; i <= 5;i++){

            System.out.println(i + " from thread " + threadNumber);

            if(threadNumber ==3){                //forziamo la 'rottura' del thread 3,ma gli altri continueranno a lavorare
                throw  new RuntimeException();
            }

            try {
                Thread.sleep(1000);           //dealy,addormentiamo il thread per 1 secondo,quindi tra una stampa e l altra el for ci sarà una pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println("n: " +i);
        }

    }




}
