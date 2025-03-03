package org.example.FlyWeight;

public class Circle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing Circle color: " + color + "x: " + x + "y: " + y);
    }

    private String color;
    public Circle(String color) {
        this.color = color;
    }

}
