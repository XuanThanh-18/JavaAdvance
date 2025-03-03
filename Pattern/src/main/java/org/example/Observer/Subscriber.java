package org.example.Observer;

public class Subscriber implements Observer{
    @Override
    public void update(String videoTitle) {
        System.out.println("YouTobeChannel has new video "+videoTitle);
    }

    private String name;
    public Subscriber(String name) {
        this.name = name;
    }

}
