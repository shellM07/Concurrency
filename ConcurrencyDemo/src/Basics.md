# Concurrency

## Program vs Process
Program is something that can be executed to cause a particular action. 

Process : When a program runs in CPU we call it a process.
 - executed on a processor.
 - all dat of an executing process is stored at RAM.

Which of the following statements accurately describes the role of cores in a CPU?
 Cores are individual processing units within a CPU, capable of executing instructions

Cores are brains of CPU. They are individual execution points in a processor.

## Threads
Thread is not something physically present in the CPU.

Threads are unit of CPU execution.Smallest possible unit of CPU execution ( to measure the task).
- occupying the processor to execute a task in its most basic and smallest unit we call it a thread.
- Thread is not physical thing.
- Thread is the smallest unit of execution in a process.
- Thread is always executed on a Core.
- Every process to execute needs at least one thread.
- Any process can have N number of threads [ even if processor has single core ].
- Any core at a time can execute one thread.
- Now a daya there is something called as hypo threading , because of which a core can executes 2 threads kind 
of in parallel.
- In general, if you have N cores , @N threads 

How could be run multiple threads in a single core ?
Concurrency

## Concurrency vs Parallelism
We always want to optimise the processor, their should no be any idle scenario for processor.

Context switching : Switching between multiple processes on a single core.

Machine executes a certain set of tasks parallelly [ illusion of parallel execution ] over a window of time.
CPU scheduler all execution.  

Parallelism:
Machine executes one or more set of tasks parallely, we need more than 1 core for parallelism.

Can we do parallelism[truly parallel execution] on a single core CPU ?
No

Concurrency and Parallelism are two different things.
Concurrency :
 - execution one task at a time
 - seems parallel over a window of time period not truly parallel.
 - can be done with >=1 cores.

Parallelism
- execution of more than 1 task at the same time.
- truly parallelism.
- can be done with >1 core.

Can we do parallelism where concurrency is possible ?
Might be possible 
Can we have concurrency where we are having parallelism?
YES


In real world it is a combination of both concurrency and parallelism.

## How to start with multiTreading
    1. Don't think in terms of multiple threads.
    2. Think in terms of what task you want to do in parallel.

By default, the code we write is a single threaded code.
Identify the task that you want to do parallel.
Print hello world.

1. Create classes for all the tasks that has been identified  
2. The name of the class should be a noun doing a verb.
     
       class HelloWorldPrint{ 
        
       }
3. Make the class implement runnable interface.

        class HelloWorldPrint implements Runnable{
        
         }
 
4. Runnable has a method called run();
 this method holds the code of the task that we want to do .

5. Implement the run method

        class HelloWorldPrint implements Runnable{
          
         public void run(){
          sout("Hello World");
        }
Task definition from step 1 to 5.


Thread creation a nd execution
1. Go to the place where you want to execute the code.
2. Create the object of the task class. 
 
        HelloWorldPritnt hmp = new HelloWorldOrint();
3. Create a thread using task object
 
       Thread t = new Thread(hmp);
4. Start the thread

       t.start();


There are two ways to make sure a class is multithreaded"
1. extend a Thread class
2. implement Runnable interface.

What is the disadvantages of extending a Thread class ?
 Multiple inheritance, if we extend a Thread class we won't be able to extend anything else.

Note : it's not possible to send a parameter to run or return something.


### run() vs start()

- When we start executing a code, the very first thread in Java is the main thread. Below code is executed by the main
thread.
Object creation 
invocation of the start method.

      public static void main(String[] args) {
       

        HelloWorldPrinter hmp = new HelloWorldPrinter();
        Thread t = new Thread(hmp);

        t.start();

    }

- As soon as t.start() executes, it creates a new thread. On that thread it will internally call a run method.
- Whatever code is written in the thread mean will be directly called on the thread.
- run() will executes the logic on the current thread.  
- start() it spawns (create) a new thread and executes run method on the new thread.
 

Q. Consider the following two statements

Threads of same process can access each other’s stack data
Threads of same process can access each other’s global data
Which of the following is correct?
 2nd option






