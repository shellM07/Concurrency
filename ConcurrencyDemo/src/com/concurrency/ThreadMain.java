package com.concurrency;


/*
* Q. Create a multi threaded program  where we can print Hello World from a different thread.*/
public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Hello World, from Thread " + Thread.currentThread().getName());

        HelloWorldPrinter hmp = new HelloWorldPrinter();
        hmp.run();  //if we directly call a run method, it will execute the logic in the current thread.
        Thread t = new Thread(hmp);
        hmp.run();
        t.start();
        System.out.println("Hello World, from Thread " + Thread.currentThread().getName());


        //AdderSubtractor
     int x = 10;
     int y = 20;
     Adder ad = new Adder(x,y);
     Subtract sb = new Subtract(x,y);
     Thread addert = new Thread(ad);
     Thread subt = new Thread(sb);
     addert.start();
     subt.start();


    }
}
//*
// Hello World, from Thread main
//Hello World, from Thread main
//Hello World, from thread Thread-0*/

// why execution order we can't control