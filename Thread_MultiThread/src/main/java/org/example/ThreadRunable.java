package org.example;

public class ThreadRunable implements Runnable{
//    private Thread dependThread;
//    public ThreadRunable(Thread t){
//        this.dependThread = t;
//    }
    @Override
    public void run() {

        for(int i=0; i<=100; i ++){
                System.out.println( Thread.currentThread().getName()+  " - Prime: "+ i);
        }
    }
}
