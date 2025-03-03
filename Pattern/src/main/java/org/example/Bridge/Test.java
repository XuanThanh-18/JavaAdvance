package org.example.Bridge;

public class Test {
    public static void main(String[] args) {
        Color color = new Red();
        Rectangle rectangle = new Rectangle(color);
        rectangle.draw();
    }

}
