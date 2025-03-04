package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(1000);  // ngu 1s roi chay ham main()

        Thread thread1 = new ThreadExtends();
        thread1.setName("Thread-1");

        Thread thread2 = new Thread(new ThreadRunable());
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Ket thuc");
    }
}
