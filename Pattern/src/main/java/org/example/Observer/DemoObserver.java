package org.example.Observer;

public class DemoObserver {
    public static void main(String[] args) {
        YouTobeChannel ssChanel = new YouTobeChannel();

        Subscriber alice = new Subscriber("alice");
        Subscriber bob = new Subscriber("bob");
        Subscriber charlie = new Subscriber("charlie");

        ssChanel.Subscribe(alice);
        ssChanel.Subscribe(bob);
        ssChanel.Subscribe(charlie);

        ssChanel.UpdateVideos("Welcome new freshers!");
    }
}
