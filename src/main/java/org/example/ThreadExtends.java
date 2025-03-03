package org.example;

public class ThreadExtends  extends Thread{
    @Override
    public void run() {
        for(int i=2; i<=1000; i+=2){
            if(Prime.isPrime(i)){
                System.out.println(Thread.currentThread().getName()+  "Prime: "+ i);
            }
        }
    }
}
