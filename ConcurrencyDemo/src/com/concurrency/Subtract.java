package com.concurrency;

public class Subtract implements Runnable{
    private int x;
    private int y;

    public Subtract(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("Subtraction is :" + (x-y)+ "from thread " + Thread.currentThread().getName() );


    }
}
