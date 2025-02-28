package org.example.Singleton;

import java.util.Random;

public class SingleXample {
    /*
    private int luckyNumber;
    public  void SingleXample (){
        Random random = new Random();
        this.luckyNumber = random.nextInt(10)+1;
    }
    public void sayHello() {

        System.out.println("Hello World + "+ this.luckyNumber );
    }
    */
    // flow
    private int luckyNumber;
    private static SingleXample instance;
    private SingleXample (){
        Random random = new Random();
        this.luckyNumber = random.nextInt(10)+1;
    }
    /*
    dungf cho nhieeuf thread suwr dung them synchronized
    public static  synchronized getInstance(){
        if(instance == null){
            instance = new SingleXample();
        }
        return instance;
    }
    */

    public static SingleXample getInstance(){
        if(instance == null){
            instance = new SingleXample();
        }
        return instance;
    }
    public void sayHello() {

        System.out.println("Hello World + "+ this.luckyNumber );
    }
}
