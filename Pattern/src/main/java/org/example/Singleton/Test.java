package org.example.Singleton;

public class Test {
    public static void main(String[] args) {
        SingleXample sample = SingleXample.getInstance();
        sample.sayHello();

        SingleXample sample1 = SingleXample.getInstance();
        sample1.sayHello();
    }
}
